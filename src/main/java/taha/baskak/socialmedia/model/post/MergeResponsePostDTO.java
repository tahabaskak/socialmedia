package taha.baskak.socialmedia.model.post;

import java.util.Date;

public class MergeResponsePostDTO {
    private Integer id;
    private String description;
    private String image;
    private Integer createdAt;

    public MergeResponsePostDTO() {
    }

    public MergeResponsePostDTO(Integer id, String description, String image, Integer createdAt) {
        this.id = id;
        this.description = description;
        this.image = image;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }
}
