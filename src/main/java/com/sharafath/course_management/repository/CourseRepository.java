package com.sharafath.course_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharafath.course_management.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
