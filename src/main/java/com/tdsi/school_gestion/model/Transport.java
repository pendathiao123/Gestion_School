package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "transport")
public class Transport {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "zone_transport")
   private String zoneTransport;

   @Column(name = "heure_transport")
   private Date heureTransport;

   @Column(name = "description")
   private String description;

   @ManyToOne
   @JoinColumn(name = "transport")
   private Transport transport;
}