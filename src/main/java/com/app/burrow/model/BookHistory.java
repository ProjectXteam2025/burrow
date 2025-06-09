package com.app.burrow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_book_history")
public class BookHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "user_id", nullable = false)
    Long userId;
    @Column(nullable = false)   /**TODO : Yet to be completed*/
    String email;
    String phone;
    String ipAddress;

    public BookHistory(Long id, String name, String email, String phone, String ipAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.ipAddress = ipAddress;
    }
}