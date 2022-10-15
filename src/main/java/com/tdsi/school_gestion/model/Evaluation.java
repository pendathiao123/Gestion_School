package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "evaluation")
public class Evaluation {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "titre_evaluation")
   private String titreEvaluation;

  @Column(name = "type_evaluation")
  private String typeEvaluation;

  @Column(name = "description")
  private String description;

  @Column(name = "date_evaluation")
  private Date dateEvaluation;

  @ManyToOne
  @JoinColumn(name = "deliberation")
  private Deliberation deliberation;

  @ManyToMany
  @JoinColumn(name = "classe")
  private List<Classe> classe;

  @ManyToMany
  @JoinColumn(name = "salle_classe")
  private List<SalleClasse> salleClasse;

  @ManyToOne
  @JoinColumn(name = "matiere")
  private Matiere matiere;

}