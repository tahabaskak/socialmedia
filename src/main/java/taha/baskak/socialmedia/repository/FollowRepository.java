package taha.baskak.socialmedia.repository;

import taha.baskak.socialmedia.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowRepository extends JpaRepository<Follow,Integer> {
    List<Follow> findByFollowerID(Integer followerID);
}
