package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This annotation marks the interface as a repository, indicating that it is a Spring Data repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // JpaRepository provides basic CRUD operations (save, find, delete) for the User entity
    // The first parameter is the type of the entity (User), and the second is the type of the entity's primary key (Long)
}
