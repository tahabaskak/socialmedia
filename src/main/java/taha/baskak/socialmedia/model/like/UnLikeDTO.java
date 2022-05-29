package taha.baskak.socialmedia.model.like;

public class UnLikeDTO {
    Integer likeId;

    public UnLikeDTO() {
    }

    public UnLikeDTO(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }
}
