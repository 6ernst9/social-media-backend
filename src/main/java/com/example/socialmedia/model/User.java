package com.example.socialmedia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Column(name = "name")
    private String name;
    @Id @Column(name = "username") @NonNull
    private String username;

    @Column(name = "password") @NonNull
    private String password;

    @Column(name = "dateOfBirth") @NonNull
    private String dateOfBirth;

    @Column(name="description")
    private String description;
    private Gender gender;
    private String joinDate;

    //TODO change type
    private String profilePhoto;
    private ArrayList<String> followers;
    private ArrayList<String> following;
    private ArrayList<Post> posts;
    private ArrayList<Post> savedPosts;
    private ArrayList<Story> highlights;
    private ArrayList<Story> storyArchive;
    private ArrayList<Post> postArchive;

    public User(String name, String username, String password, String dateOfBirth, Gender gender) {
        this.name = name;
        this.username = username;
        this.password = Encryption.encrypt(password);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        joinDate = LocalDate.now().toString();
        followers = new ArrayList<>();
        following = new ArrayList<>();
        posts = new ArrayList<>();
        savedPosts = new ArrayList<>();
        highlights = new ArrayList<>();
        storyArchive = new ArrayList<>();
        postArchive = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDescription() {
        return description;
    }

    public Gender getGender() {
        return gender;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public ArrayList<String> getFollowers() {
        return followers;
    }

    public ArrayList<String> getFollowing() {
        return following;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<Post> getSavedPosts() {
        return savedPosts;
    }

    public ArrayList<Story> getHighlights() {
        return highlights;
    }

    public ArrayList<Story> getStoryArchive() {
        return storyArchive;
    }

    public ArrayList<Post> getPostArchive() {
        return postArchive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setFollowers(ArrayList<String> followers) {
        this.followers = followers;
    }

    public void setFollowing(ArrayList<String> following) {
        this.following = following;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setSavedPosts(ArrayList<Post> savedPosts) {
        this.savedPosts = savedPosts;
    }

    public void setHighlights(ArrayList<Story> highlights) {
        this.highlights = highlights;
    }

    public void setStoryArchive(ArrayList<Story> storyArchive) {
        this.storyArchive = storyArchive;
    }

    public void setPostArchive(ArrayList<Post> postArchive) {
        this.postArchive = postArchive;
    }
}
