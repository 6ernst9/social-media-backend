package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "SavedPhotos")
@Data
public class SavedPhoto {

    @EmbeddedId
    private SavedPhotoKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("postId")
    @JoinColumn(name = "post_id")
    private Post post;

}

@Embeddable
class SavedPhotoKey implements Serializable {
    private int userId;
    private int postId;
}
