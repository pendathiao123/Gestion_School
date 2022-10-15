package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comptable")
public class Comptable extends Personnel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;



}