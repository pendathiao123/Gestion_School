package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Long> {
}
