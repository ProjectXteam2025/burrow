package com.app.burrow.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookHistoryRepository extends JpaRepository<BookHistory, Long> {

    @Query("SELECT bu FROM BookHistory bu WHERE bu.id = :id")
    List<BookHistory> findBookHistoryById(@Param("id") Long id);

    @Query("SELECT bu FROM BookHistory bu WHERE bu.userId = :user_id")
    List<BookHistory> findBookHistoryByUserId(@Param("email") String email);

    @Query("SELECT bu FROM BookHistory bu WHERE bu.bookId = :book_id")
    List<BookHistory> findBookHistoryByBookId(@Param("id") String phone);
}
