package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "salle")
public class Salle {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_sall")
   private String nomSalle;

   @Column(name = "numero")
   private int numeroSalle;

   @Column(name = "nbre_pla")
   private int nbrePlace;

   @ManyToOne
   @JoinColumn(name = "batiment")
   private Batiment batiment;

}