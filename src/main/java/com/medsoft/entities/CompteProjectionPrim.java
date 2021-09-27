package com.medsoft.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="solde" ,types = Compte.class)
public interface CompteProjectionPrim {
    public TypeCompte getType () ;
}
