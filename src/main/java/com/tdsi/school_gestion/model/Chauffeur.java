package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "chauffeur")
public class Chauffeur {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "prenom_chauffeur")
   private String prenomChauffeur;

   @Column(name = "nom_chauffeur")
   private String nomChauffeur;

   @Column(name = "email")
   private String email;

   @Column(name = "tel")
   private String tel;


}