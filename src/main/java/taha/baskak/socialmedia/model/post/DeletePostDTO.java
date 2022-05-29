package taha.baskak.socialmedia.model.post;

public class DeletePostDTO {
    Integer postId;

    public DeletePostDTO() {
    }

    public DeletePostDTO(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}
