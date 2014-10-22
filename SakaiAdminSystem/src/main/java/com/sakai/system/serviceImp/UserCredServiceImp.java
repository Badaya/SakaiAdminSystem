package com.sakai.system.serviceImp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakai.system.domain.UserCredentials;
import com.sakai.system.repository.UserCredRepository;
import com.sakai.system.service.UserCredService;


@Service
@Transactional 
public class UserCredServiceImp implements UserCredService{
	
	private UserCredRepository  userCredRepository;

	@Override
	public UserCredentials create(UserCredentials userCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCredentials read(String userCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserCredentials userCredentials) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String userCredentials) {
		// TODO Auto-generated method stub
		
	}

}
