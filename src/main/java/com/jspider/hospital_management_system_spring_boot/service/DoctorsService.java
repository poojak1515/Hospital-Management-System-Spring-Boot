package com.jspider.hospital_management_system_spring_boot.service;

import java.util.List;
import java.util.Optional;

import com.jspider.hospital_management_system_spring_boot.entity.Doctor;

public interface DoctorsService {
	
	Doctor saveDoctor(Doctor doctor);
	List<Doctor> getAllDoctor();
	Optional<Doctor> getDoctorById(long id);
	Doctor findByEmail(String email);
	Doctor findByContactNumber(String contactNumber);
	List<Doctor> findBySpecialization(String specialization);
	boolean existsByEmail(String email);
	boolean existsByContactNumber(String contactNumber);
	boolean authenticateDoctor(Long doctorId, String password);
	boolean deleteDrById(long id);

}
