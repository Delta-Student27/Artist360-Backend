package com.artist360.repository;

import com.artist360.model.Artwork;
import com.artist360.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {

    List<Artwork> findByArtist(User artist);

}