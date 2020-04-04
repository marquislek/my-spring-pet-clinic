package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findByID(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
