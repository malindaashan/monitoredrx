package com.aeturnum.monitoredrx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeturnum.monitoredrx.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

	List<Project> findByUserId(Integer userId);

}
