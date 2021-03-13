package com.thiagosseidel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagosseidel.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
