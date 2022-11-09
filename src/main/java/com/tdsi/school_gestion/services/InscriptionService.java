package com.tdsi.school_gestion.services;


import com.tdsi.school_gestion.model.Inscription;
import com.tdsi.school_gestion.repository.InscriptionRepository;
import com.tdsi.school_gestion.services.dto.InscriptionDTO;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    private final InscriptionRepository inscriptionRepository;
    private final ClasseService classeService;
    private final EleveService eleveService;

    public InscriptionService(InscriptionRepository inscriptionRepository, ClasseService classeService, EleveService eleveService) {
        this.inscriptionRepository = inscriptionRepository;
        this.classeService = classeService;
        this.eleveService = eleveService;
    }

    public Inscription create(InscriptionDTO inscriptionDTO, Long idEleve, Long idClasse){
        Inscription inscription = new Inscription();
        inscription.setDateInscription(inscriptionDTO.getDateInscription());
        inscription.setDescription(inscriptionDTO.getDescription());
        inscription.setEleve(eleveService.findById(idEleve).get());
        inscription.setClasse(classeService.findById(idClasse).get());

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
