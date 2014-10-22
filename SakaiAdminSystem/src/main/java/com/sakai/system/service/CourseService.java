package com.sakai.system.service;

import java.util.List;

import com.sakai.system.domain.Course;


public interface CourseService {
	
	Course create(Course course);
	
	Course read(long courseId);
	
	void update(long courseId, Course course);
	
	void delete(String cartId);
	
	public List<Course> findAll();

}
