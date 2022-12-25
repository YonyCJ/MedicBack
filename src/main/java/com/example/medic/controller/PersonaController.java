package com.example.medic.controller;

import com.example.medic.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService service;
@GetMapping
    public void saludar(){
        this.service.Saludar();
    }
}
