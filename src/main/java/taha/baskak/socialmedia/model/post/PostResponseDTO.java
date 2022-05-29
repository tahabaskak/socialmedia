package taha.baskak.socialmedia.model.post;

import java.util.Date;

public class PostResponseDTO {
    Integer id;
    String description;
    Integer userID;
    String image;
    Date createdDate;

    public PostResponseDTO() {
    }

    public PostResponseDTO(Integer id, String description, Integer userID, String image, Date createdDate) {
        this.id = id;
        this.description = description;
        this.userID = userID;
        this.image = image;
        this.createdDate = createdDate;
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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
