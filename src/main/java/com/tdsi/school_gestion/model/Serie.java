package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code_serie")
    private String code_serie;

    @ManyToMany
    @JoinColumn(name = "niveau")
    private List<Niveau> niveau;

    @ManyToMany
    @JoinColumn(name = "classe")
    private List<Classe> classe;
}
