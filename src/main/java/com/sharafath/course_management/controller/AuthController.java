package com.sharafath.course_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharafath.course_management.model.User;
import com.sharafath.course_management.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/signup")
	public User signup(@RequestBody User user) {
		return authService.registerUser(user);
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) {
		return authService.loginUser(user.getEmail(), user.getPassword());
	}
	
}
