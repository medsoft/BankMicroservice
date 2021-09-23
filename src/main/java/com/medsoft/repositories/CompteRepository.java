package com.medsoft.repositories;


import com.medsoft.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository <Compte , Long> {

}
