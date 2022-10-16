package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {

    Optional<Eleve> findByEmail(String email);
    Optional<Eleve> findByTel(String tel);
    Optional<Eleve> findByMatricule(String matricule);


}
