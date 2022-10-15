package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "absence")
public class Absence {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "motif")
   private String motif;

   @ManyToOne
   @JoinColumn(name = "eleve")
   private Eleve eleve;

   @ManyToOne
   @JoinColumn(name = "cours")
   private Cours cours;

}