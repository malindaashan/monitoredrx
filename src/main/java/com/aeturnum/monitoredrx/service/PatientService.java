package com.aeturnum.monitoredrx.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeturnum.monitoredrx.entity.Patient;
import com.aeturnum.monitoredrx.repository.PatientRepository;

@Service
public class PatientService {
	static final Logger logger= LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	PatientRepository patientRepository;
	
	public List<Patient> getAllPatientDetails(){
		return patientRepository.findAll();
		
	}
	public boolean deletePatient(Long id){
		try {
			patientRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			logger.error("Error while deletePatient",e);
			return false;
		}
	}
	
	public boolean savePatient(Patient patient){
		try {
			patientRepository.save(patient);
			return true;
		}catch(Exception e) {
			logger.error("Error while savePatient",e);
			return false;
		}
	}
	public boolean updatePatient(Patient patient){
		try {
			patientRepository.save(patient);
			return true;
		}catch(Exception e) {
			logger.error("Error while updatePatient",e);
			return false;
		}
	}
}
