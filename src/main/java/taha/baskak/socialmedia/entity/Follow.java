package taha.baskak.socialmedia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Follow {
    @Id
    @GeneratedValue
    Integer id;
    Integer followerID;
    Integer followingID;
    Integer createData;

    public Follow() {
    }

    public Follow(Integer followerID, Integer followingID, Integer createData) {
        this.followerID = followerID;
        this.followingID = followingID;
        this.createData = createData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowerID() {
        return followerID;
    }

    public void setFollowerID(Integer followerID) {
        this.followerID = followerID;
    }

    public Integer getFollowingID() {
        return followingID;
    }

    public void setFollowingID(Integer followingID) {
        this.followingID = followingID;
    }

    public Integer getCreateData() {
        return createData;
    }

    public void setCreateData(Integer createData) {
        this.createData = createData;
    }

}
