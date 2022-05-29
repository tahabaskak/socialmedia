package taha.baskak.socialmedia.repository;

import taha.baskak.socialmedia.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like,Integer>  {
    List<Like> findAllByUserID(Integer userID);
}
