package com.thiagosseidel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagosseidel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
