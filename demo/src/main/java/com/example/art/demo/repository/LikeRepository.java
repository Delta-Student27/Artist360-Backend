package com.example.art.demo.repository;


import com.example.art.demo.model.Artwork;
import com.example.art.demo.model.Like;
import com.example.art.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByUserAndArtwork(User user, Artwork artwork);

    List<Like> findByArtwork(Artwork artwork);

}