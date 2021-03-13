package com.thiagosseidel.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosseidel.course.entities.Product;
import com.thiagosseidel.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		
		return productRepository.findById(id).get();
	}
}
