package com.artist360.repository;

import com.artist360.model.Comment;
import com.artist360.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByArtwork(Artwork artwork);

}