package com.sakai.system.repository;

import java.util.List;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import org.springframework.stereotype.Repository;

import com.sakai.system.domain.Section;
import com.sakai.system.domain.Student;
import com.sakai.system.domain.Teacher;


@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
	
	
	
	
	/*@Query("select cs from CourseSection cs where ID =:id")
	public List<Section> getSecctions(@Param("id") int key);
	
	@Query("select s from Student s where SectionID =:sectionId")
	public List<Student> getStudents(@Param("sectionId") long sectionId);*/

}
