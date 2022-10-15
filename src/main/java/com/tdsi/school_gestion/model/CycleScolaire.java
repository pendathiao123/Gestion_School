package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "cycle_scolaire")
public class CycleScolaire {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "nom_cycle")
   private String nomCycle;

   @Column(name = "description")
   private String description;

   @ManyToMany
   @JoinColumn(name = "eleve")
   private List<Eleve> eleve;


}