package com.aeturnum.monitoredrx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeturnum.monitoredrx.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	List<Patient> findByProjectId(Integer projectId);

}
