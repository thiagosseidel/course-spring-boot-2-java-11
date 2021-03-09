package com.thiagosseidel.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosseidel.course.entities.User;
import com.thiagosseidel.course.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
//		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "1223345");
//		//User u2 = new User(2L, "Maria2", "maria2@gmail.com", "99999999", "1223345");
//		
//		return ResponseEntity.ok().body(u);
		
		return ResponseEntity.ok().body(userRepository.findAll());
	}
}
