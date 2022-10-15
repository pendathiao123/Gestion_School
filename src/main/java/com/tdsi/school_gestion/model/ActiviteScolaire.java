package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "activite_scolaire")
public class ActiviteScolaire {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_activite")
   private String nomActivite;

   @Column(name = "date")
   private Date date;

   @Column(name = "lieu")
   private String lieu;

   @Column(name = "description")
   private String description;

   @ManyToMany
   @JoinColumn(name = "ecole")
   private List<Ecole> ecole;


}