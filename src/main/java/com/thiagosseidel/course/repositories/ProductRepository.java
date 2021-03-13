package com.thiagosseidel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagosseidel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
