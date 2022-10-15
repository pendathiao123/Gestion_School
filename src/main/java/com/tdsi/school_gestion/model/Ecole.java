package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "ecole")
public class Ecole {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_ecole")
   private String nomEcole;

   @Column(name = "adresse_ecole")
   private String adresseEcole;

   @ManyToMany
   @JoinColumn(name = "cycle_scolaire")
   private List<CycleScolaire> cycleScolaire;

   @ManyToMany
   @JoinColumn(name = "personnel")
   private List<Personnel> personnel;


}