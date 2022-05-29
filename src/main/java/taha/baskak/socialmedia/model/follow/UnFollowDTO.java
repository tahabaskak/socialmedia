package taha.baskak.socialmedia.model.follow;

public class UnFollowDTO {
    Integer followId;

    public UnFollowDTO() {
    }

    public UnFollowDTO(Integer followId) {
        this.followId = followId;
    }

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }
}
