package com.jspider.hospital_management_system_spring_boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.hospital_management_system_spring_boot.entity.Doctor;
import com.jspider.hospital_management_system_spring_boot.service.DoctorsService;

@RestController
@RequestMapping(value = "/api/doctor")
public class DoctorController {

	@Autowired
	private DoctorsService service;
	
	@PostMapping
	public Doctor saveDoctorController(@RequestBody Doctor doctor) {
		return service.saveDoctor(doctor);
	}
	
	@GetMapping
	public List<Doctor> getAllDoctorController() {
		return service.getAllDoctor();
	}
	
	@GetMapping(value = "/id")
	public Optional<Doctor> getDoctorByIdController(@RequestParam long id) {
		return service.getDoctorById(id);
	}
	
	@GetMapping(value = "/email")
	public Doctor findByEmailController(@RequestParam String email) {
		return service.findByEmail(email);
	}
	
	@GetMapping(value = "/contactNumber")
	public Doctor findByContactNumber(@RequestParam String contactNumber) {
		return service.findByContactNumber(contactNumber);
	}
	
	@GetMapping(value = "/specialization")
	public List<Doctor> findBySpecializationController(@RequestParam String specialization) {
		return service.findBySpecialization(specialization);
	}
	
	
	// Boolean EndPoints
	
	@PostMapping(value = "/existsByEmail")
	public boolean existsByEmailComtroller(@RequestParam String email) {
		return service.existsByEmail(email);
	}
	
	@PostMapping(value = "/existsByContactNumber")
	public boolean existsByContactNumberController(String contactNumber) {
		return service.existsByContactNumber(contactNumber);
	}
	
	
	
	
	
	
	
	
	
	
	
}
	
