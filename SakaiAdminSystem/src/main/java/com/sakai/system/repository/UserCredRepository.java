package com.sakai.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sakai.system.domain.UserCredentials;
@Repository
public interface UserCredRepository extends CrudRepository<UserCredentials, String> {

}
