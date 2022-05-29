package taha.baskak.socialmedia.model.post;

import java.util.List;

public class MergePostsDTO {
    private List<List<MergeResponsePostDTO>> postsID;

    public MergePostsDTO() {
    }

    public MergePostsDTO(List<List<MergeResponsePostDTO>> postsID) {
        this.postsID = postsID;
    }

    public List<List<MergeResponsePostDTO>> getPostsID() {
        return postsID;
    }

    public void setPostsID(List<List<MergeResponsePostDTO>> postsID) {
        this.postsID = postsID;
    }
}
