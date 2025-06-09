package com.app.burrow.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.id = :id")
    User findBooksById(@Param("id") Long id);

    @Query("SELECT b FROM Book b WHERE b.author = :author")
    List<User> findBooksByAuthor(@Param("author") String author);

    @Query("SELECT b FROM Book b WHERE b.publication = :phone")
    List<User> findUsersByPublisher(@Param("id") String publication);
}
