package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return service.addUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return service.updateUser(user);
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getUserById(id);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteUserById(id);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return service.getAllUsers();
	}


}

