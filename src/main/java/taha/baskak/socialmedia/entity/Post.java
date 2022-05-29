package taha.baskak.socialmedia.entity;

import taha.baskak.socialmedia.util.Utility;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    Integer id;
    String description;
    Integer userID;
    String image;
    Integer createdDate;

    public Post() {
    }

    public Post(String description, Integer userID, String image) {
        this.description = description;
        this.userID = userID;
        this.image = image;
        this.createdDate = Utility.DateToDays(new Date());
    }

    public Integer getId() {
        return this.id;
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

    public Integer getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }
}
