package com.tdsi.school_gestion.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "note_cours")
public class NoteCours {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "titre_cours")
   private String titreCours;

   @Column(name = "description")
   private String description;

}