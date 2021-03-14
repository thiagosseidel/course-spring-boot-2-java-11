package com.thiagosseidel.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosseidel.course.entities.User;
import com.thiagosseidel.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		
		return userRepository.findById(id).get();
	}
	
	public User insert(User user) {
		
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		
		userRepository.deleteById(id);
	}
}
