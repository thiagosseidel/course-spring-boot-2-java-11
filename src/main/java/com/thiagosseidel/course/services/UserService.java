package com.thiagosseidel.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.thiagosseidel.course.entities.User;
import com.thiagosseidel.course.repositories.UserRepository;
import com.thiagosseidel.course.services.exceptions.DatabaseException;
import com.thiagosseidel.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = userRepository.findById(id); 
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		
		try {
		
			userRepository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			
			throw new ResourceNotFoundException(id);
		}
		catch (DataIntegrityViolationException e) {
			
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		
		User entity = userRepository.getOne(id);
		
		updateData(entity, obj);
		
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {

		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
