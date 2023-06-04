package com.example.socialmedia.model;

import java.util.ArrayList;

public class Comment {
    private String text;
    private ArrayList<String> likes;
    private ArrayList<Comment> replies;
    private String commTime;
    private String user;
}
