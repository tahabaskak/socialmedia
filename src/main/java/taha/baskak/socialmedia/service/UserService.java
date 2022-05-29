package taha.baskak.socialmedia.service;

import taha.baskak.socialmedia.constant.Constant;
import taha.baskak.socialmedia.util.Utility;
import taha.baskak.socialmedia.entity.User;
import taha.baskak.socialmedia.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taha.baskak.socialmedia.model.user.GetUsersDTO;
import taha.baskak.socialmedia.model.user.UserDTO;
import taha.baskak.socialmedia.model.user.UserUpdateDTO;
import taha.baskak.socialmedia.repository.UserRepository;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User updateUser(UserUpdateDTO user) throws CustomException {
        Optional<User> resultUser = userRepository.findByUserName(user.getUserName());
        if(!resultUser.isPresent()){
            throw new CustomException(Constant.USER_ALREADY_EXIST);
        }
        resultUser.get().setEmail(user.getEmail());
        resultUser.get().setFullName(user.getFullName());
        resultUser.get().setBio(user.getBio());
        resultUser.get().setProfilePicture(user.getProfilePicture());
        userRepository.save(resultUser.get());
        return null;
    }

    public List<GetUsersDTO> getAllUsers(){
        List<User> result = userRepository.findAll();
        List<GetUsersDTO> users = new ArrayList<>();
        for (User user : result) {
            users.add(new GetUsersDTO(user.getId(),user.getUserName(),user.getEmail(),user.getFullName(),
                    user.getProfilePicture(),user.getBio(), Utility.DaysToDate(user.getCreatedDate())));
        }
        return users;
    }

    public User singUp(UserDTO user) throws CustomException {
        Optional<User> dbUser = userRepository.findByUserName(user.getUserName());
        if(dbUser.isPresent()){
            throw new CustomException(Constant.USER_ALREADY_EXIST);
        }
        String encryptedPassword = null;
        try {
            encryptedPassword = hashPassword(user.getPassword());
        }catch (Exception e){
            e.printStackTrace();
            throw new CustomException(e.getMessage());
        }
        User newUser = new User(user.getUserName(), user.getEmail(), encryptedPassword);

        return userRepository.save(newUser);
    }

    public String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(Constant.HASH_ALGORITHM);
        messageDigest.update(password.getBytes());
        byte[] digits = messageDigest.digest();
        return DatatypeConverter.printHexBinary(digits).toUpperCase();
    }

}
