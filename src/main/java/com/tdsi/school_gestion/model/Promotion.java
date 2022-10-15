package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "promotion")
public class Promotion {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name="annee_scolaire")
   private String anneeScolaire;

   @ManyToOne
   @JoinColumn(name = "emploi_du_temps")
   private EmploiDuTemps emploiDuTemps;

}