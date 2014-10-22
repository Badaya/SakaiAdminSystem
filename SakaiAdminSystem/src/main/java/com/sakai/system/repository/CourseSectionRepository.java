package com.sakai.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sakai.system.domain.Section;
@Repository
public interface CourseSectionRepository extends CrudRepository<Section, Long> {

}
