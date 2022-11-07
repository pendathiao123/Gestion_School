package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.PayementScolaire;
import com.tdsi.school_gestion.repository.PayementScolaireRepository;
import com.tdsi.school_gestion.services.dto.PayementScolaireDTO;
import org.springframework.stereotype.Service;

@Service
public class PayementScolaireService {
    private final PayementScolaireRepository payementScolaireRepository;

    public PayementScolaireService(PayementScolaireRepository payementScolaireRepository) {
        this.payementScolaireRepository = payementScolaireRepository;
    }

    public PayementScolaire create(PayementScolaireDTO payementScolaireDTO){
        PayementScolaire payementScolaire = new PayementScolaire();
        payementScolaire.setDatePayement(payementScolaireDTO.getDate());
        payementScolaire.setMontantPayement(payementScolaire.getMontantPayement());
        payementScolaire.setDescription(payementScolaireDTO.getDescription());

        return payementScolaireRepository.save(payementScolaire);
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
