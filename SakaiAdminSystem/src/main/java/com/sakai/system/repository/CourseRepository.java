package com.sakai.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sakai.system.domain.Course;;


@Repository
@Transactional(propagation=Propagation.MANDATORY)
public interface CourseRepository extends CrudRepository<Course,Long> {

}
