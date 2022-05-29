package taha.baskak.socialmedia.model.post;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PostRequestDTO {
    @NotEmpty
    @NotNull
    private String description;
    private Integer userID;
    private String image;

    public PostRequestDTO() {
    }

    public PostRequestDTO(String description, Integer userID, String image) {
        this.description = description;
        this.userID = userID;
        this.image = image;
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
}
