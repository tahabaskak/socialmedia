package taha.baskak.socialmedia.model.user;

import taha.baskak.socialmedia.constant.Constant;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    @NotNull
    @NotEmpty
    @Size(min = Constant.MIN_LENGTH,max = Constant.MAX_LENGTH)
    private String userName;
    @NotEmpty
    @NotNull
    @Email
    private String email;
    @NotNull
    @NotEmpty
    @Size(min = Constant.MIN_LENGTH)
    private String password;

    public UserDTO() {
    }

    public UserDTO(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
