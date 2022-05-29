package taha.baskak.socialmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taha.baskak.socialmedia.util.Utility;
import taha.baskak.socialmedia.entity.Follow;
import taha.baskak.socialmedia.model.follow.FollowDTO;
import taha.baskak.socialmedia.model.follow.UnFollowDTO;
import taha.baskak.socialmedia.repository.FollowRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FollowService {

    @Autowired
    FollowRepository followRepository;

    public Follow follow(FollowDTO follow){
        Follow newFollow = new Follow(follow.getFollowerID(),follow.getFollowingID(), Utility.DateToDays(new Date()));
        return followRepository.save(newFollow);
    }

    public boolean unFollow(UnFollowDTO unFollow){
        Optional<Follow> resultLike = followRepository.findById(unFollow.getFollowId());
        if(resultLike.isPresent()){
            followRepository.delete(resultLike.get());
            // unlike operation
            return true;
        }
        return false;
    }

    public List<FollowDTO> getAllFollows(){
        List<Follow> result = followRepository.findAll();
        List<FollowDTO> follows = new ArrayList<>();
        for (Follow follow : result) {
            follows.add(new FollowDTO(follow.getFollowerID(),follow.getFollowingID()));
        }
        return follows;
    }

}
