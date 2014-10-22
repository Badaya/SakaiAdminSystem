package com.sakai.system.service;


import java.util.List;
import com.sakai.system.domain.Teacher;

public interface TeacherService {
    
	Teacher create(Teacher teacher);
  	
	Teacher read(long teacherId);
	
	void update(String teacherId, Teacher teacher);
	
	void delete(String teacherId);
	
	public List<Teacher> findAll();
	
}
