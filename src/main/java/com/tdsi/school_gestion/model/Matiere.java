package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "matiere")
public class Matiere {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_matiere")
   private String nomMatiere;

   @Column(name = "description")
   private String description;

   @ManyToMany
   @JoinColumn(name = "professeur")
   private List<Professeur> professeur;

}