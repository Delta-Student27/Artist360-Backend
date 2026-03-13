package com.artist360.service;

import com.artist360.model.Comment;
import com.artist360.model.Artwork;
import com.artist360.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByArtwork(Artwork artwork) {
        return commentRepository.findByArtwork(artwork);
    }
}