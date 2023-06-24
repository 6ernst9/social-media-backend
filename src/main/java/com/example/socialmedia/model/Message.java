package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Messages")
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int senderId;
    private int receiverId;
    private String content;
    private boolean isLiked;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

}
