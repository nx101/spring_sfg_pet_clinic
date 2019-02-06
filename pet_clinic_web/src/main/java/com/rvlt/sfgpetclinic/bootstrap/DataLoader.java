package com.rvlt.sfgpetclinic.bootstrap;

import com.rvlt.sfgpetclinic.model.Owner;
import com.rvlt.sfgpetclinic.model.Vet;
import com.rvlt.sfgpetclinic.services.OwnerService;
import com.rvlt.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// CommandLineRunner interface indicates this class's run method
// to be called when context is ready

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Yoda");
        owner1.setLastName("Greenthing");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Luke");
        owner2.setLastName("Skywalker");
        ownerService.save(owner2);

        System.out.println("Owners Loaded.");

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet");
        vet1.setLastName("Vader");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vet");
        vet2.setLastName("Leah");
        vetService.save(vet2);

        System.out.println("Vets Loaded.");

    }
}
