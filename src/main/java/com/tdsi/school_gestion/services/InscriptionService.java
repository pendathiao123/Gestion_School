package com.tdsi.school_gestion.services;


import com.tdsi.school_gestion.model.Inscription;
import com.tdsi.school_gestion.repository.InscriptionRepository;
import com.tdsi.school_gestion.services.dto.InscriptionDTO;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    private final InscriptionRepository inscriptionRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    public Inscription create(InscriptionDTO inscriptionDTO){
        Inscription inscription = new Inscription();
        inscription.setDateInscription(inscriptionDTO.getDateInscription());
        inscription.setDescription(inscriptionDTO.getDescription());

        return inscriptionRepository.save(inscription);
    }

    public Inscription update(Long id, InscriptionDTO inscriptionDTO){
        Inscription inscription = inscriptionRepository.findById(id).get();
        inscription.setDateInscription(inscriptionDTO.getDateInscription());
        inscription.setDescription(inscriptionDTO.getDescription());

        return inscriptionRepository.save(inscription);
    }

    public void delete(Long id){
        inscriptionRepository.deleteById(id);
    }
}
