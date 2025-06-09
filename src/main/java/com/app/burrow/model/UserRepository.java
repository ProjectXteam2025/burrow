package com.app.burrow.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id = :id")
    List<User> findUsersById(@Param("id") Long id);

    @Query("SELECT u FROM User u WHERE u.email = :email")
    List<User> findUsersByEmail(@Param("email") String email);

    @Query("SELECT u FROM User u WHERE u.phone = :phone")
    List<User> findUsersByPhone(@Param("id") String phone);
}
