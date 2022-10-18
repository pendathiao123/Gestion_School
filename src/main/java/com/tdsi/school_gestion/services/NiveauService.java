package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.model.Niveau;
import com.tdsi.school_gestion.repository.NiveauRepository;
import com.tdsi.school_gestion.services.dto.NiveauDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NiveauService {
    private final NiveauRepository niveauRepository;

    public NiveauService(NiveauRepository niveauRepository) {
        this.niveauRepository = niveauRepository;
    }

    public Niveau creaye(NiveauDTO niveauDTO){
        Niveau niveau = new Niveau();
        niveau.setNomNiveau(niveauDTO.getNomNiveau());
        niveau.setDescription(niveauDTO.getDescription());

        return niveauRepository.save(niveau);
    }

    public Optional<Niveau> getByNomNiveau(String nomNiveau){
        return niveauRepository.findByNomNiveau(nomNiveau);
    }

    public void delete(Long id){
        niveauRepository.deleteById(id);
    }

    public Niveau update(Long id, NiveauDTO niveauDTO){
        Optional<Niveau> niveau = niveauRepository.findById(id);
        niveau.get().setNomNiveau(niveauDTO.getNomNiveau());
        niveau.get().setDescription(niveauDTO.getDescription());

        return niveauRepository.save(niveau.get());
    }
}
