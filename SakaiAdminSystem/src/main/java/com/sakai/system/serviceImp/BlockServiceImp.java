package com.sakai.system.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sakai.system.domain.Block;
import com.sakai.system.repository.BlockRepository;
import com.sakai.system.service.BlockService;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW) 
public class BlockServiceImp implements BlockService{
	
	@Autowired
	private BlockRepository  blockRepository;

	@Override
	public Block create(Block block) {
		// TODO Auto-generated method stub
		blockRepository.save(block);
		return block;
	}

	@Override
	public Block read(long blockId) {
		// TODO Auto-generated method stub
		Block block = blockRepository.findOne(blockId);
		return block;
	}

	@Override
	public void update(long blockId, Block block) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int blockId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Block> findAll() {
		// TODO Auto-generated method stub
      List<Block> listBlock = (List<Block>)blockRepository.findAll();
		return listBlock;
	}

}
