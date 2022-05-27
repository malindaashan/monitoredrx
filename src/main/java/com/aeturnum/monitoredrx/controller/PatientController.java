package com.aeturnum.monitoredrx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeturnum.monitoredrx.entity.Patient;
import com.aeturnum.monitoredrx.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;

	@GetMapping("/servicecheck")
	public String serviceCheck() {
		return "This is service check message from monitoredrx";
	}
	
	@PostMapping("/addPatient")
	public ResponseEntity<?>  addPatient(@RequestBody Patient patient) {
		if(patientService.savePatient(patient)) {
			return new ResponseEntity<>(HttpStatus.OK);	
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/updatePatient")
	public ResponseEntity<?> updatePatient(@RequestBody Patient patient) {
		if(patientService.updatePatient(patient)) {
			return new ResponseEntity<>(HttpStatus.OK);	
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/deletePatient/{id}")
	public ResponseEntity<?> addPatient(@PathVariable Long id) {
        if(!patientService.deletePatient(id)) {
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
        }
        return new ResponseEntity<>(HttpStatus.OK);	

	}
	
	@GetMapping("/allPatients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatientDetails();
	}
}
