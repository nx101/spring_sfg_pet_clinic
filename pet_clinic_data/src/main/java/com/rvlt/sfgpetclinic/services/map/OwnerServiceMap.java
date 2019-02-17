package com.rvlt.sfgpetclinic.services.map;

import com.rvlt.sfgpetclinic.model.Owner;
import com.rvlt.sfgpetclinic.model.Pet;
import com.rvlt.sfgpetclinic.services.OwnerService;
import com.rvlt.sfgpetclinic.services.PetService;
import com.rvlt.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {

                    // persist pet's PetType to PetType Service
                    if (pet.getPetType() != null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    } else {
                        throw new RuntimeException("PetType is mandatory.");
                    }

                    // persist pet to Pet Service
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }

                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
