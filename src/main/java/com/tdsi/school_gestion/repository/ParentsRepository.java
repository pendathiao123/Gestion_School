package com.tdsi.school_gestion.repository;

import com.tdsi.school_gestion.model.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {

}
