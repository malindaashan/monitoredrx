package com.aeturnum.monitoredrx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeturnum.monitoredrx.entity.User;
import com.aeturnum.monitoredrx.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@CrossOrigin
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
}
