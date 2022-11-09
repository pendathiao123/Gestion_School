package com.tdsi.school_gestion.repository;


import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.model.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {
    Optional<Classe> findByIndiceClasse(String indice);
}
