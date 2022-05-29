package taha.baskak.socialmedia.model.post;

import java.util.Date;
import java.util.List;

public class MergeResponseDTO {
    private List<MergeResponsePostDTO> posts;

    public MergeResponseDTO() {
    }

    public MergeResponseDTO(List<MergeResponsePostDTO> posts) {
        this.posts = posts;
    }

    public List<MergeResponsePostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<MergeResponsePostDTO> posts) {
        this.posts = posts;
    }
}
