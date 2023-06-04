package com.example.socialmedia.model;

import java.util.ArrayList;

public class Story {
    private final String photo;
    private final String storyTime;
    private final ArrayList<String> userReactions;
    private final int time;

    public Story(String photo, String storyTime, int time) {
        this.photo = photo;
        this.storyTime = storyTime;
        userReactions = new ArrayList<>();
        this.time = time;
    }

    public String getPhoto() {
        return photo;
    }

    public String getStoryTime() {
        return storyTime;
    }

    public ArrayList<String> getUserReactions() {
        return userReactions;
    }

    public int getTime() {
        return time;
    }
}
