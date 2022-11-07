package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Inscription;
import com.tdsi.school_gestion.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
