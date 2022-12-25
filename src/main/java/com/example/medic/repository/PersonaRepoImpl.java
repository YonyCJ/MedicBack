package com.example.medic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements PersonaRepository{
    @Override
    public void Saludar() {
        System.out.println("adfasdf");
    }
}
