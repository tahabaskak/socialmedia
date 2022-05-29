package taha.baskak.socialmedia.model.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserUpdateDTO {
    @NotEmpty
    @NotNull
    private String userName;
    @NotEmpty
    @NotNull
    private String fullName;
    @NotEmpty
    @NotNull
    private String profilePicture;
    @NotEmpty
    @NotNull
    private String bio;
    @NotNull
    @NotEmpty
    @Email
    private String email;

    public UserUpdateDTO() {
    }

    public UserUpdateDTO(String userName, String fullName, String profilePicture, String bio,String email) {
        this.userName = userName;
        this.fullName = fullName;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
