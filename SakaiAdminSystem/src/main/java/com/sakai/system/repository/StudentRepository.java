package com.sakai.system.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.sakai.system.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
