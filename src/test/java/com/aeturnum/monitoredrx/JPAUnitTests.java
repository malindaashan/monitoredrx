package com.aeturnum.monitoredrx;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

import com.aeturnum.monitoredrx.entity.Patient;
import com.aeturnum.monitoredrx.repository.PatientRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JPAUnitTests {
	
	@Autowired
	PatientRepository patientrepository;
	
	
	@Test
	public void findAllPatients() {
		Patient patient =new Patient();
		patient.setFirstname("Nimal");
		patient.setLastname("Perera");
		patient.setCity("Wattala");
		patient.setState("Western");
		patient.setZipcode(11710);
		patient.setPhonenumber("0912323245");
		patient.setAddress("235, Wattala");
		patient.setEmail("nirmal@gmail.com");
		patientrepository.save(patient);
		
		List<Patient> patientList = patientrepository.findAll();
		assertThat(patientList).isNotNull();

	}
}
