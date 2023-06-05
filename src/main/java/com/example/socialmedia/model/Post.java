package com.example.socialmedia.model;

import java.util.ArrayList;

public class Post {
    private ArrayList<String> photos;
    private String postTime;
    private String location;
    private String description;
    private int views;

    private Long userId;
    private ArrayList<String> likes;
    private ArrayList<Comment> comments;
}
