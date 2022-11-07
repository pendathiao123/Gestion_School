package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "payement_scolaire")
public class PayementScolaire {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "montant_payement", nullable = false)
   private Double montantPayement;

   @Column(name = "date_payement", nullable = false)
   private Date datePayement;

   @Column(name = "description")
   private String description;

   @ManyToOne
   @JoinColumn(name = "eleve")
   private Eleve eleve;
}