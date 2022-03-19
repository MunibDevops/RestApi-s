package com.springrest.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.restapi.courseDao.courseRepository;
import com.springrest.restapi.entities.Course;

@Service
public class servicesImpl implements Services {

   //private List<Course> list;
	
	@Autowired
	courseRepository repository;
	
	servicesImpl()
	{
//		list=new ArrayList<>();
//		
//		list.add(new Course(001,"Java","This is Java Course"));
//		
//		list.add(new Course(002,"Python","This is Python Course"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		
			return repository.findAll();
	}

    @Override
	public Course getCourse(long courseID)
    {
		
//		Course c=null;
//		
//		for(Course course : list)
//		{
//			if(course.getCourseID()==courseID)
//			{
//				c=course;
//				break;
//			}
//		     
//		}
//		
    	return repository.getById(courseID);
		
	}


	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
        
		  repository.save(course);
		
          return course;
	}


	@Override
	public Course updateCourse(Course course) {
		
//		for(Course c : list)
//		{
//			if(c.getCourseID()==course.getCourseID())
//			{
//				c.setCourseName(course.getCourseName());
//				c.setCourseDescription(course.getCourseDescription());
//				break;
//			}
//		}
		
		repository.save(course);
		
		
		return course;
		
	}


	@Override
	public Course deleteCourse(long courseID) 
	{
		
//		Course c=null;
//		
//		for( Course course : list)
//		{
//			if(course.getCourseID()==courseID)
//			{
//				list.remove(course);
//			}
//			c=course;
//		}
		
		Course course=repository.getById(courseID);

		repository.deleteById(course.getCourseID());
		
		repository.save(course);
		
		
		return course;
		
	}

	

}
