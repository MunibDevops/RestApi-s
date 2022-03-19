package com.springrest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.restapi.entities.Course;
import com.springrest.restapi.services.Services;

@RestController
public class MyController {

	@Autowired
	Services serve;
	
	@GetMapping("/courses")
	public List<Course>getCourses()
	{
		return this.serve.getCourses();
	}
	
	@GetMapping("/course/{courseID}")
	public Course getCourse(@PathVariable String courseID)
	{
		return this.serve.getCourse(Long.parseLong(courseID));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.serve.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.serve.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseID}")
	public Course deleteCourse(@PathVariable String courseID)
	{
		return this.serve.deleteCourse(Long.parseLong(courseID));
	}
	
	
}
