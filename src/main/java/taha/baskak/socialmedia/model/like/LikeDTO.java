package taha.baskak.socialmedia.model.like;

public class LikeDTO {
    private Integer postID;
    private Integer userID;

    public LikeDTO() {
    }

    public LikeDTO(Integer postID, Integer userID) {
        this.postID = postID;
        this.userID = userID;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
