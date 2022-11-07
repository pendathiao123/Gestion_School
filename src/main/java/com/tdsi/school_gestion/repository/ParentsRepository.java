package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {
    Optional<Parents> findByEmail(String email);
    Optional<Parents> findByTel(String tel);
}
