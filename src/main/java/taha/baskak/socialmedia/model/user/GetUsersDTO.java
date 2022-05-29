package taha.baskak.socialmedia.model.user;

import java.util.Date;

public class GetUsersDTO {
    Integer id;
    String userName;
    String email;
    String fullName;
    String profilePicture;
    String bio;
    Date createdDate;

    public GetUsersDTO() {
    }

    public GetUsersDTO(Integer id, String userName, String email, String fullName, String profilePicture, String bio, Date createdDate) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.fullName = fullName;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
