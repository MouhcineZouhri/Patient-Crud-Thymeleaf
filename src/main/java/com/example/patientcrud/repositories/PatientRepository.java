package com.example.patientcrud.repositories;


import com.example.patientcrud.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository  extends JpaRepository<Patient , Long> {

    List<Patient> findAllByName(String name);
}
