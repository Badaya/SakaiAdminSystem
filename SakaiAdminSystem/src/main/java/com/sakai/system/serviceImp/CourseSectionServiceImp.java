package com.sakai.system.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakai.system.domain.Section;
import com.sakai.system.repository.CourseSectionRepository;
import com.sakai.system.service.CourseSectionService;

@Service
@Transactional 
public class CourseSectionServiceImp implements CourseSectionService {

	@Autowired
	private CourseSectionRepository courseSectionRepository;
	
	@Override
	public Section create(Section courseSection) {
		// TODO Auto-generated method stub
		
		courseSectionRepository.save(courseSection);
		return courseSection;
	}

	@Override
	public Section read(long courseSectionId) {
		// TODO Auto-generated method stub
		Section section = courseSectionRepository.findOne(courseSectionId);
		return section;
	}

	@Override
	public void update(String cartId, Section courseSection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Section> findAll() {
		// TODO Auto-generated method stub
		List<Section> listSection = (List<Section>) courseSectionRepository.findAll();
		return listSection;
	}

}
