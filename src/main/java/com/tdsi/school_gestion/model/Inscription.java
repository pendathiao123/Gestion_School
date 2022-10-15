package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "inscription")
public class Inscription {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "date_inscription")
   private Date dateInscription;

   @Column(name = "description")
   private String description;

   @ManyToOne
   @JoinColumn(name = "eleve")
   private Eleve eleve;

   @ManyToOne
   @JoinColumn(name = "promotion")
   private Promotion promotion;

   @ManyToOne
   @JoinColumn(name = "niveau")
   private Niveau niveau;

   @ManyToOne
   @JoinColumn(name = "serie")
   private Serie serie;

   @ManyToOne
   @JoinColumn(name = "cycle")
   private CycleScolaire cycleScolaire;
}