package com.example.DoctorData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DoctorData.entity.Doctor;



public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
