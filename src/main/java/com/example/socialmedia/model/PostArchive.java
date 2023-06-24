package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PostArchive")
@Data
public class PostArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int postId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
