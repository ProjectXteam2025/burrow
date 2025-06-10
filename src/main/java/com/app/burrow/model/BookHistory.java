package com.app.burrow.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_book_history")
public class BookHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "user_id", nullable = false)
    Long userId;
    @Column(name = "book_id")
    Long bookId;
    @Column(name = "user_email")
    String userEmail;
    @Column(name = "has_owned")
    Boolean hasOwned;
    @Column(name = "has_borrowed")
    Boolean hasBorrowed;
    @Column(name = "created_at")
    LocalDateTime createdAt;
    @Column(name = "updated_at")
    LocalDateTime updatedAt;


    public BookHistory(Long id, Long userId, Long bookId, String userEmail, Boolean hasOwned, Boolean hasBorrowed, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.userEmail = userEmail;
        this.hasOwned = hasOwned;
        this.hasBorrowed = hasBorrowed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}