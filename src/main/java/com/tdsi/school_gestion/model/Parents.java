package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "parents")
public class Parents {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "prenom", nullable = false)
   private String prenom;

   @Column(name = "nom", nullable = false)
   private String nom;

   @Column(name = "email")
   private String email;

   @Column(name = "tel_1", nullable = false)
   private String tel1;

   @Column(name = "tel_2")
   private String tel2;

   @Column(name = "adresse")
   private String adresse;


}