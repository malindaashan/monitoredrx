package com.aeturnum.monitoredrx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aeturnum.monitoredrx.entity.Project;
import com.aeturnum.monitoredrx.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@CrossOrigin
	@GetMapping("/getProjectByUser/{userId}")
	public List<Project> getAllUsers(@PathVariable Integer userId) {
		return projectService.getProjectByUserId(userId);
	}
}
