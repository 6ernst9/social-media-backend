package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Following")
@Data
public class Following {

    @EmbeddedId
    private FollowingKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("followingId")
    @JoinColumn(name = "following_id")
    private User following;

}

@Embeddable
class FollowingKey implements Serializable {
    private int userId;
    private int followingId;
}
