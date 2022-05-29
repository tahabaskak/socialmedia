package taha.baskak.socialmedia.model.follow;

public class FollowDTO {
    private Integer followerID;
    private Integer followingID;

    public FollowDTO() {
    }

    public FollowDTO(Integer followerID, Integer followingID) {
        this.followerID = followerID;
        this.followingID = followingID;
    }

    public Integer getFollowerID() {
        return followerID;
    }

    public void setFollowerID(Integer followerID) {
        this.followerID = followerID;
    }

    public Integer getFollowingID() {
        return followingID;
    }

    public void setFollowingID(Integer followingID) {
        this.followingID = followingID;
    }
}
