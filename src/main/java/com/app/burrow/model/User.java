package com.app.burrow.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(nullable = false)
    String email;
    String phone;
    @Column(name = "created_at",nullable = false)
    LocalDateTime  createdAt;
    @Column(name = "updated_at",nullable = false)
    LocalDateTime updatedAt;
    String ipAddress;

    public User(Long id, String name, String email, String phone,LocalDateTime  createdAt,LocalDateTime  updatedAt, String ipAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.ipAddress = ipAddress;
    }
}

