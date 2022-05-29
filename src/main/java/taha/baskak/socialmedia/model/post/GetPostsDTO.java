package taha.baskak.socialmedia.model.post;

import java.util.List;

public class GetPostsDTO {
    private Integer userID;
    private List<Integer> postsID;

    public GetPostsDTO() {
    }

    public GetPostsDTO(Integer userID, List<Integer> postsID) {
        this.userID = userID;
        this.postsID = postsID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public List<Integer> getPostsID() {
        return postsID;
    }

    public void setPostsID(List<Integer> postsID) {
        this.postsID = postsID;
    }
}
