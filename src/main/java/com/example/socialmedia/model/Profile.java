package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Profile")
@Data
public class Profile {

    @Id
    private int userId;
    private String profilePhoto;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
