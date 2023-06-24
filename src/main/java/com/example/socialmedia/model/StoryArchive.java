package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "StoryArchive")
@Data
public class StoryArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private Timestamp storyTime;
    private String photo;
    private int reactions;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
