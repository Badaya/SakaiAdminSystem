package com.sakai.system.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import com.sakai.system.domain.Teacher;
import com.sakai.system.repository.TeacherRepository;
import com.sakai.system.service.TeacherService;


@Service
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class TeacherServiceImp implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher create(Teacher teacher) {
		// TODO Auto-generated method stub
		Teacher teach =teacherRepository.save(teacher);
		return teach;
	}

	@Override
	public Teacher read(long teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherRepository.findOne(teacherId);		
		return teacher;
	}

	@Override
	public void update(String teacherId, Teacher teacher) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void delete(String teacherId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		List<Teacher> listTeacher = (List<Teacher>) teacherRepository.findAll();
		
		return listTeacher;
	}

}
