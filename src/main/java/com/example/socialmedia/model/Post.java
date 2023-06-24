package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "Posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String photo;
    private Timestamp postTime;
    private String location;
    private String description;
    private int views;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
