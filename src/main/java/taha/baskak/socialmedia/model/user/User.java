package taha.baskak.socialmedia.model.user;

public class User {
    private Integer id;
    private String userName;
    private String fullName;
    private String profilePicture;
    private boolean followed;

    public User() {
    }

    public User(Integer id, String userName, String fullName, String profilePicture, boolean followed) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.profilePicture = profilePicture;
        this.followed = followed;
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

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
