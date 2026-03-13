package com.artist360.repository;

import com.artist360.model.Like;
import com.artist360.model.Artwork;
import com.artist360.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByUserAndArtwork(User user, Artwork artwork);

    List<Like> findByArtwork(Artwork artwork);

}