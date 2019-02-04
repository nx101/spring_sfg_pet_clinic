package com.rvlt.sfgpetclinic.services;

import com.rvlt.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
