package com.sharafath.course_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharafath.course_management.model.Course;
import com.sharafath.course_management.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
	}
	
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
	
	public Course updateCourse(Long id,Course course) {
		
		Course existingCourse=courseRepository.findById(id).orElse(null);
		
		
		if (existingCourse!=null) {
			existingCourse.setTitle(course.getTitle());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setPrice(course.getPrice());
			
			return courseRepository.save(existingCourse);
		}
		
		return null;
	}
	
	
}
