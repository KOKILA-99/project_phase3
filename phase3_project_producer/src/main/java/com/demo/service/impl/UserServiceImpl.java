package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository user_repository;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return user_repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return user_repository.save(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return user_repository.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		user_repository.deleteById(id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return user_repository.findAll();
	}
	

}
