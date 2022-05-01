package com.example.patientcrud.controller;

import com.example.patientcrud.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/")
    public String homePage(HttpServletRequest request, Model model){

        String name = request.getParameter("name");

        if(name == null || name.equals("")){

            model.addAttribute("patients" , patientService.getAll());

        }else{

            model.addAttribute("patients" , patientService.getFilter(name));
        }

        return "index";
    }

    @GetMapping("/delete")
    public String delete(Long id ){
        patientService.deletePatient(id);

        return "redirect:/";
    }
}

