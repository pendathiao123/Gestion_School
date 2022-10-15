package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "duree")
    private Date duree;

    @ManyToOne
    @JoinColumn(name = "matiere")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "professeur")
    private Professeur professeur;

    @ManyToOne
    @JoinColumn(name = "classe")
    private Classe classe;

    @ManyToOne
    @JoinColumn(name = "salle_classe")
    private SalleClasse salleClasse;

    @ManyToOne
    @JoinColumn(name = "emploi_du_temps")
    private EmploiDuTemps emploiDuTemps;
}
