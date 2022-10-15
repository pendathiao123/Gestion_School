package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "eleve")
public class Eleve {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "prenom_eleve")
   private String prenomEleve;

   @Column(name = "nom_eleve")
   private String nomEleve;

   @Column(name = "matricule")
   private String matricule;

   @Column(name = "password")
   private String password;

   @Column(name = "email")
   private String email;

   @Column(name = "tel")
   private String tel;

   @ManyToOne
   @JoinColumn(name = "cantine")
   private Cantine cantine;

   @ManyToOne
   @JoinColumn(name = "classe")
   private Classe classe;

   @ManyToOne
   @JoinColumn(name = "deliberation")
   private Deliberation deliberation;

   @ManyToOne
   @JoinColumn(name = "inscription")
   private Inscription inscription;

   @ManyToMany
   @JoinColumn(name = "transport")
   private List<Transport> transport;

   @ManyToOne
   @JoinColumn(name = "parent")
   private Parents parents;
}