package taha.baskak.socialmedia.model.post;

import taha.baskak.socialmedia.model.user.UserResponseForAlgthmDTO;

import java.util.Date;

public class PostResponseForAlgthmDTO {
    private Integer id;
    private String description;
    private UserResponseForAlgthmDTO owner;
    private Date createdAt;
    private Boolean liked;

    public PostResponseForAlgthmDTO() {
    }

    public PostResponseForAlgthmDTO(Integer id, String description, UserResponseForAlgthmDTO owner, Date createdAt, Boolean liked) {
        this.id = id;
        this.description = description;
        this.owner = owner;
        this.createdAt = createdAt;
        this.liked = liked;
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

    public UserResponseForAlgthmDTO getOwner() {
        return owner;
    }

    public void setOwner(UserResponseForAlgthmDTO owner) {
        this.owner = owner;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }
}
