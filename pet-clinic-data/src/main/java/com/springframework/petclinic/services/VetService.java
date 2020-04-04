package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    

    Vet findByID(long id);
    
    Vet save(Vet vet);

    Set<Vet> findAll();
}
