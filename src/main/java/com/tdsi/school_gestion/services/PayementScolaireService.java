package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.model.Eleve;
import com.tdsi.school_gestion.model.PayementScolaire;
import com.tdsi.school_gestion.repository.PayementScolaireRepository;
import com.tdsi.school_gestion.services.dto.PayementScolaireDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayementScolaireService {
    private final PayementScolaireRepository payementScolaireRepository;
    private final EleveService eleveService;

    public PayementScolaireService(PayementScolaireRepository payementScolaireRepository, EleveService eleveService) {
        this.payementScolaireRepository = payementScolaireRepository;
        this.eleveService = eleveService;
    }

    public PayementScolaire create(PayementScolaireDTO payementScolaireDTO, Long idEleve){
        PayementScolaire payementScolaire = new PayementScolaire();
        payementScolaire.setDatePayement(payementScolaireDTO.getDate());
        payementScolaire.setMontantPayement(payementScolaire.getMontantPayement());
        payementScolaire.setDescription(payementScolaireDTO.getDescription());
        payementScolaire.setEleve(eleveService.findById(idEleve).get());

        return payementScolaireRepository.save(payementScolaire);
    }

    public List<PayementScolaire> getByEleve(Eleve eleve){
       return payementScolaireRepository.findByEleve(eleve);
    }

    public PayementScolaire update(Long id, PayementScolaireDTO payementScolaireDTO){
        PayementScolaire payementScolaire = payementScolaireRepository.findById(id).get();
        payementScolaire.setDatePayement(payementScolaireDTO.getDate());
        payementScolaire.setMontantPayement(payementScolaireDTO.getMontant());

        return payementScolaireRepository.save(payementScolaire);
    }

    public void delete(Long id){
        payementScolaireRepository.deleteById(id);
    }

}
