package com.example.medic.service;

import com.example.medic.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public void Saludar() {
        this.personaRepository.Saludar();
    }
}
