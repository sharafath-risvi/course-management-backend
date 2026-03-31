package com.sharafath.course_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharafath.course_management.model.Course;
import com.sharafath.course_management.service.CourseService;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {
		
	@Autowired
	private CourseService courseService;
	
	//Add COURSES
	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course){
		return courseService.addCourse(course);
	}
	
	//GET_ALL_COURSES
	@GetMapping("/getcourse")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
		return "Course deleted Successfully";
	} 
	
	@PutMapping("/update/{id}")
	public Course updateCourse(@PathVariable Long id,@RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}
	
}
