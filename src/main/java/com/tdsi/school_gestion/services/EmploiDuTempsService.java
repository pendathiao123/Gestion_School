package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.*;
import com.tdsi.school_gestion.repository.EmploiDuTempsRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class EmploiDuTempsService {
    private final EmploiDuTempsRepository emploiDuTempsRepository;

    public EmploiDuTempsService(EmploiDuTempsRepository emploiDuTempsRepository) {
        this.emploiDuTempsRepository = emploiDuTempsRepository;
    }

    public Optional<EmploiDuTemps> findById(Long id){
        return emploiDuTempsRepository.findById(id);
    }

    public EmploiDuTemps create(Date date, Cours cours){
        EmploiDuTemps emploiDuTemps = new EmploiDuTemps();
        emploiDuTemps.setDate(date);
        emploiDuTemps.setCours(cours);

        return emploiDuTemps;
    }

    public EmploiDuTemps update(Long id, Date date, Cours cours){
        EmploiDuTemps emploiDuTemps = findById(id).get();
        emploiDuTemps.setCours(cours);
        emploiDuTemps.setDate(date);

        return emploiDuTemps;
    }

    public void delete(Long id){
        emploiDuTempsRepository.deleteById(id);
    }


}
