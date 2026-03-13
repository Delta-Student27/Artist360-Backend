package com.artist360.service;

import com.artist360.model.Like;
import com.artist360.model.Artwork;
import com.artist360.model.User;
import com.artist360.repository.LikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public Optional<Like> findByUserAndArtwork(User user, Artwork artwork) {
        return likeRepository.findByUserAndArtwork(user, artwork);
    }

    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    public List<Like> getLikesByArtwork(Artwork artwork) {
        return likeRepository.findByArtwork(artwork);
    }
}