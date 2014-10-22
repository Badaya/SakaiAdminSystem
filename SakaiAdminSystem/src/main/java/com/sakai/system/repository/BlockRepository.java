package com.sakai.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sakai.system.domain.Block;

@Repository
public interface BlockRepository extends CrudRepository<Block,Long>{

}
