package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.CycleScolaire;
import com.tdsi.school_gestion.model.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Long> {
}
