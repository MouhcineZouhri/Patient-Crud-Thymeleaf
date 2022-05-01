package com.example.patientcrud.service;

import com.example.patientcrud.entities.Patient;
import com.example.patientcrud.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<Patient> getAll(){
        return this.patientRepository.findAll();
    }

    public List<Patient> getFilter(String name){
        return this.patientRepository.findAllByName(name);
    }

    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id){
        this.patientRepository.deleteById(id);
    }

}
