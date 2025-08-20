package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
    private int id;


    private String title;   //VARCHAR(255)

}
