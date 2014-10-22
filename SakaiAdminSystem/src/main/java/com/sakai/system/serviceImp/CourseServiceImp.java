package com.sakai.system.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.sakai.system.domain.Course;
import com.sakai.system.repository.CourseRepository;
import com.sakai.system.service.CourseService;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW) 
public class CourseServiceImp implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course create(Course course) {
		courseRepository.save(course);// TODO Auto-generated method stub
		return course;
	}

	@Override
	public Course read(long courseId) {
		Course course = courseRepository.findOne(courseId);
		return course;
	}

	@Override
	public void update(long courseId, Course course) {
		// TODO Auto-generated method stub
		Course oldcourse = courseRepository.findOne(courseId);
		oldcourse.setDescription(course.getDescription());
		oldcourse.setTitle(course.getTitle());
		oldcourse.setSubjectCode(course.getSubjectCode());
		courseRepository.save(oldcourse);
	}

	@Override
	public void delete(String cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		List<Course> listCourse = (List<Course>) courseRepository.findAll();
		return listCourse;
	}

}
