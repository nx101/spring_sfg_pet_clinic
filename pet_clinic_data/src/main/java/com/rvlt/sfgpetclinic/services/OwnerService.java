package com.rvlt.sfgpetclinic.services;

import com.rvlt.sfgpetclinic.model.Owner;

import java.util.Set;


// Service layer to abstract the data implementation
// So we can INJECT various data implementations to

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
