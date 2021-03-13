package com.thiagosseidel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagosseidel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
