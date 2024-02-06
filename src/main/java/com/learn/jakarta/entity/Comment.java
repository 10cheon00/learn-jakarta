package com.learn.jakarta.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String content;

    @Column
    private Timestamp createdTimestamp;

    public Long getId() {
        return this.id;
    }
}
