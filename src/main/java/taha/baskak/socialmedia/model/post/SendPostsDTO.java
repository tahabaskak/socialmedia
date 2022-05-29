package taha.baskak.socialmedia.model.post;

import taha.baskak.socialmedia.model.user.User;

import java.util.Date;

public class SendPostsDTO {
    private Integer id;
    private String description;
    private User owner;
    private String image;
    private Date createdAt;
    private boolean liked;

    public SendPostsDTO() {
    }

    public SendPostsDTO(Integer id, String description, User owner, String image, Date createdAt, boolean liked) {
        this.id = id;
        this.description = description;
        this.owner = owner;
        this.image = image;
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
