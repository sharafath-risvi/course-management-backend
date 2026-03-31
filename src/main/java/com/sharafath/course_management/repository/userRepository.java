package com.sharafath.course_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharafath.course_management.model.User;

public interface userRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
}
