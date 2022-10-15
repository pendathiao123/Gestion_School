package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;


@Data
@Entity
@Table(name = "batiment")
public class Batiment {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_batiment")
   private String nomBatiment;

   @ManyToOne
   @JoinColumn(name = "ecole")
   private Ecole ecole;

}