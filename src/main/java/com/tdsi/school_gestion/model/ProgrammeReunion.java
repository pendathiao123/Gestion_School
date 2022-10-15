package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table
public class ProgrammeReunion {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "date")
   private Date date;

   @Column(name = "duree")
   private int duree;

   @ManyToOne
   @JoinColumn(name = "salle_reunion")
   private SalleReunion salleReunion;
}