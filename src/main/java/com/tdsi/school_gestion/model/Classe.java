package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "classe")
public class Classe {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "indice_classe")
   private String indiceClasse;

   @ManyToMany
   @JoinColumn(name = "professeur")
   private List<Professeur> professeur;

   @ManyToMany
   @JoinColumn(name = "evaluation")
   private List<Evaluation> evaluation;

   @ManyToOne
   @JoinColumn(name = "niveau")
   private Niveau niveau;

}