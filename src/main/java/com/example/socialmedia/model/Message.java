package com.example.socialmedia.model;

public class Message {
    private final String sender;
    private final String receiver;
    private final String content;
    private boolean isLiked;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = Encryption.encrypt(content);
        this.isLiked = false;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
