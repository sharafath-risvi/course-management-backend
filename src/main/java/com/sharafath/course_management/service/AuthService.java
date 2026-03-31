package com.sharafath.course_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharafath.course_management.model.User;
import com.sharafath.course_management.repository.userRepository;

@Service
public class AuthService {
	
	@Autowired
	private userRepository userRepository;
	
	public User registerUser(User user) {
		
		user.setRole("USER");
		return userRepository.save(user);
	}
	
	public User loginUser(String email,String password) {
		User user=userRepository.findByEmail(email);
		
		if (user!=null && user.getPassword().equals(password)) {
			return user;
		}
		throw new RuntimeException("Invalid credentials");
	}
	
	
}
