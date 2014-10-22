package com.sakai.system.service;

import java.util.List;

import com.sakai.system.domain.Block;
import com.sakai.system.domain.Section;
import com.sakai.system.domain.Student;
import com.sakai.system.domain.Teacher;

public interface StudentService {
	
    Student create(Student student);
  	
    Student read(long studentId);
	
	void update(String studentId, Student student);
	
	void delete(String studentId);
	
	public List<Student> findAll();

}
