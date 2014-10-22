package com.sakai.system.service;

import java.util.List;

import com.sakai.system.domain.Block;
import com.sakai.system.domain.Course;
import com.sakai.system.domain.Section;

public interface BlockService {
	
    Block create(Block block);
  	
    Block read(long blockId);
	
	void update(long blockId, Block block);
	
	void delete(int blockId);
	
	public List<Block> findAll();

}
