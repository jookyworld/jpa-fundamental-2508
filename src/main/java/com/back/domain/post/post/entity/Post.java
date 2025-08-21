package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String title;   //VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content;

    public Post(String title, String content) {
        createDate = LocalDateTime.now();
        this.modifyDate = this.createDate;
        this.title = title;
        this.content = content;
    }
}
