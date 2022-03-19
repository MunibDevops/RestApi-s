package com.springrest.restapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseID;
	
	private String courseName;
	
	private String courseDescription;
	

	
	public Course(long courseID, String courseName, String courseDescription) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + "]";
	}
	
	
}
