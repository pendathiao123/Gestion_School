package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Cantine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantineRepository extends JpaRepository<Cantine, Long> {
}
