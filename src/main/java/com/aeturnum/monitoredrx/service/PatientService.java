package com.aeturnum.monitoredrx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeturnum.monitoredrx.entity.Patient;
import com.aeturnum.monitoredrx.repository.PatientRepository;

@Service
public class PatientService {
	
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
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean savePatient(Patient patient){
		try {
			patientRepository.save(patient);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updatePatient(Patient patient){
		try {
			patientRepository.save(patient);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
