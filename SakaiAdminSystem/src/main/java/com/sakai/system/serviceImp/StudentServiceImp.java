package com.sakai.system.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakai.system.domain.Student;
import com.sakai.system.repository.StudentRepository;
import com.sakai.system.service.StudentService;


@Service
@Transactional 
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student create(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student read(long studentId) {
		// TODO Auto-generated method stub
		Student student = studentRepository.findOne(studentId);
		return student;
	}

	@Override
	public void update(String studentId, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> listStudent = (List<Student>) studentRepository.findAll();
		return listStudent;
	}

}
