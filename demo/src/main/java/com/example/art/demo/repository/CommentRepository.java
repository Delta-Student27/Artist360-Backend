package com.example.art.demo.repository;

import com.example.art.demo.model.Artwork;
import com.example.art.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByArtwork(Artwork artwork);

}