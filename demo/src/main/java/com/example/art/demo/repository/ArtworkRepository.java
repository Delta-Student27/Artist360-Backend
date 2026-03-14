package com.example.art.demo.repository;

import com.example.art.demo.model.Artwork;
import com.example.art.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {

    List<Artwork> findByArtist(User artist);

}