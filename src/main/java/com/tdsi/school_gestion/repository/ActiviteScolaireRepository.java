package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.ActiviteScolaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteScolaireRepository extends JpaRepository<ActiviteScolaire, Long> {
}
