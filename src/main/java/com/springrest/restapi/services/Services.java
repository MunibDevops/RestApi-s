package com.springrest.restapi.services;

import java.util.List;

import com.springrest.restapi.entities.Course;

public interface Services {

	
	public List<Course>getCourses();
	
	public Course getCourse(long courseID);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(long courseID);
	
}
