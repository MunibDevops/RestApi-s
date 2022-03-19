package com.springrest.restapi.courseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.restapi.entities.Course;

public interface courseRepository extends JpaRepository<Course, Long>{

	
	
}
