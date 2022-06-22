package com.aeturnum.monitoredrx.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeturnum.monitoredrx.entity.Project;
import com.aeturnum.monitoredrx.repository.ProjectRepository;

@Service
public class ProjectService {
	static final Logger logger= LoggerFactory.getLogger(ProjectService.class);
	
	@Autowired
	ProjectRepository projectRepository;
	
	public List<Project> getProjectByUserId(Integer userId){
		 List<Project> projects = null;
		try {
			projects = projectRepository.findByUserId(userId);
			return projects;
		}catch(Exception e) {
			logger.error("Error while getProjectByUserId",e);
			return projects;
		}
	} 
}
