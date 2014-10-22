package com.sakai.system.service;

import com.sakai.system.domain.Teacher;
import com.sakai.system.domain.UserCredentials;

public interface UserCredService {
	
	UserCredentials create(UserCredentials userCredentials);
  	
    UserCredentials read(String userName);
	
	void update(UserCredentials userCredentials);
	
	void delete(String userCredentials);
	
	

}
