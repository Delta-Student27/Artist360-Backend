package com.artist360.service;

import com.artist360.model.Artwork;
import com.artist360.model.User;
import com.artist360.repository.ArtworkRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    public Artwork saveArtwork(Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    public List<Artwork> getArtworksByArtist(User artist) {
        return artworkRepository.findByArtist(artist);
    }
}