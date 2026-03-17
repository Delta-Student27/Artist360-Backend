package com.example.art.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "artworks")
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String imageUrl;

    private LocalDateTime createdAt;

    // ⭐ Rating information
    private Double averageRating = 0.0;

    private Integer ratingCount = 0;

    // Artist relation
    @ManyToOne
    @JoinColumn(name = "artist_id")
    @JsonIgnoreProperties("artworks")
    private User artist;

    // Comments relation
    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Comment> comments;

    // Likes relation
    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Like> likes;

    // Ratings relation
    @OneToMany(mappedBy = "artwork", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rating> ratings;

    public Artwork() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User getArtist() {
        return artist;
    }

    public void setArtist(User artist) {
        this.artist = artist;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}