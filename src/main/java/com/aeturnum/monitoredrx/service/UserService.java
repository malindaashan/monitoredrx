package com.aeturnum.monitoredrx.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeturnum.monitoredrx.entity.User;
import com.aeturnum.monitoredrx.repository.UserRepository;

@Service
public class UserService {
	static final Logger logger= LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> userList = null;
		try {
			userList = userRepository.findAll();
			return userList;
		}catch(Exception e) {
			logger.error("Error while getAllUsers",e);
			return userList;
		}
	}
}
