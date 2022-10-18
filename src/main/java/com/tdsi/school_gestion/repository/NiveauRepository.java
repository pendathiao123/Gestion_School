package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.model.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau,Long> {
    Optional<Niveau> findByNomNiveau(String nomNiveau);
}
