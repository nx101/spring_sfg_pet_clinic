package com.rvlt.sfgpetclinic.services;

import com.rvlt.sfgpetclinic.model.Owner;


// Service layer to abstract the data implementation
// So we can INJECT various data implementations to

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
