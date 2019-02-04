package com.rvlt.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // Hibernate recommends using the boxed type Long instead of long
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
