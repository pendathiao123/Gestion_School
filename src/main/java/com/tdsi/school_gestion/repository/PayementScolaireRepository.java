package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Eleve;
import com.tdsi.school_gestion.model.PayementScolaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayementScolaireRepository extends JpaRepository<PayementScolaire, Long> {
    List<PayementScolaire> findByEleve(Eleve eleve);
}
