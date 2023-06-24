package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "Comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int postId;
    private String text;
    private Timestamp commentTime;
    private int likes;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
