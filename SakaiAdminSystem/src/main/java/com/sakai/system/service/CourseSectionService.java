package com.sakai.system.service;

import java.util.List;
import com.sakai.system.domain.Section;



public interface CourseSectionService {
	
    Section create(Section courseSection);
	
    Section read(long courseSectionId);
	
	void update(String cartId, Section courseSection);
	
	void delete(String cartId);
	
	public List<Section> findAll();

}
