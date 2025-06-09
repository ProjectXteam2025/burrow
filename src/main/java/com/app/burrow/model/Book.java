package com.app.burrow.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "book_name", nullable = false)
    String name;
    @Column(nullable = false)
    String author;
    String publication;
    @Column(name = "book_price",nullable = false)
    Integer price;
    @Column(name = "created_at",nullable = false)
    LocalDateTime  createdAt;


    public Book(Long id, String name, String author, String publication, Integer price, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.price = price;
        this.createdAt = createdAt;
    }
}