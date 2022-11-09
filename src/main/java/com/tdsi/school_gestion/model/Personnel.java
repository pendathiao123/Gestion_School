package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "personnel")
public class Personnel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "prenom")
   private String prenom;

   @Column(name = "nom")
   private String nom;

   @Column(name = "login")
   private String login;

   @Column(name = "password")
   private String password;

   @Column(name = "email")
   private String email;

   @Column(name = "tel")
   private String tel;

}