package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Followers")
@Data
public class Follower {

    @EmbeddedId
    private FollowerKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("followerId")
    @JoinColumn(name = "follower_id")
    private User follower;


}

@Embeddable
class FollowerKey implements Serializable {
    private int userId;
    private int followerId;
}
