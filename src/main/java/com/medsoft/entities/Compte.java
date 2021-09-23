package com.medsoft.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compte {
    @Id
    @GeneratedValue
    private Long id  ;
    private double solde  ;
    @Temporal(TemporalType.DATE)
    private Date datecreation  ;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private  TypeCompte type  ;
}
