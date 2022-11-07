package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.PayementScolaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementScolaireRepository extends JpaRepository<PayementScolaire, Long> {
}
