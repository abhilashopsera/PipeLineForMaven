package com.example.DoctorData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DoctorData.entity.Doctor;
import com.example.DoctorData.Repository.DoctorRepository;

@RestController
public class DoctorController {
	@Autowired
	private DoctorRepository doctorrepository;
	
	@PostMapping("/adddoctor")
	public String saveCustomer(@RequestBody Doctor emp) {
		doctorrepository.save(emp);
		return "Doctor added successfully::"+emp.getId();
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getDoctor(){
		return doctorrepository.findAll();
	}
	
	@GetMapping("/findDoctor/{id}")
	public Optional<Doctor> getDoctor(@PathVariable Integer id){
		return doctorrepository.findById(id);
	}
	
	@GetMapping("/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable Integer id) {
		doctorrepository.deleteById(id);
		return "Deleted Doctor Succesfully";
	}

}
