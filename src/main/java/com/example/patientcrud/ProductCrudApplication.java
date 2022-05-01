package com.example.patientcrud;

import com.example.patientcrud.entities.Patient;
import com.example.patientcrud.repositories.PatientRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ProductCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCrudApplication.class, args);
    }

    
    @Bean
    public ApplicationRunner runner(PatientRepository patientRepository){
        return args -> {

            Patient mohsin = Patient.builder()
                    .name("mohsin")
                    .sick(false)
                    .birthDay(LocalDateTime.now())
                    .build();

            patientRepository.save(mohsin);


            Patient omar = Patient.builder()
                    .name("omar")
                    .sick(false)
                    .birthDay(LocalDateTime.now())
                    .build();

            patientRepository.save(omar);

            Patient mestapha = Patient.builder()
                    .name("mestapha")
                    .sick(false)
                    .birthDay(LocalDateTime.now())
                    .build();

            patientRepository.save(mestapha);
        };
    }
}
