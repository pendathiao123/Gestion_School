package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "niveau")
public class Niveau {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_niveau")
   private String nomNiveau;

   @Column(name = "description")
   private String description;

   @ManyToOne
   @JoinColumn(name = "cycle_scolaire")
   private CycleScolaire cycleScolaire;

   @ManyToMany
   @JoinColumn(name = "promotion")
   private List<Promotion> promotion;

}