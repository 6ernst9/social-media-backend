package com.example.socialmedia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;
import java.util.ArrayList;
import java.util.Objects;

@Table
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {
    @Column(name = "name")
    private String name;
    @Id @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name="description")
    private String description;
    private Gender gender;
    private String joinDate;

    //TODO change type
    private String profilePhoto;
    private ArrayList<String> followers;
    private ArrayList<String> following;
    private Long postsid;




    private ArrayList<Post> savedPosts;
    private ArrayList<Story> highlights;
    private ArrayList<Story> storyArchive;
    private ArrayList<Post> postArchive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return Objects.equals(getUsername(), user.getUsername());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
