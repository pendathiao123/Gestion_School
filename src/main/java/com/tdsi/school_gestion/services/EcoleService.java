package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Ecole;
import com.tdsi.school_gestion.repository.EcoleRepository;
import com.tdsi.school_gestion.services.dto.EcoleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EcoleService {
    private final EcoleRepository ecoleRepository;

    public EcoleService(EcoleRepository ecoleRepository) {
        this.ecoleRepository = ecoleRepository;
    }

    public Optional<Ecole> getEcole(Long id){
        return ecoleRepository.findById(id);
    }

    public Ecole create(EcoleDTO ecoleDTO){
        Ecole ecole = new Ecole();
        ecole.setAdresseEcole(ecoleDTO.getAdresseEcole());
        ecole.setNomEcole(ecoleDTO.getNomEcole());

        return ecoleRepository.save(ecole);
    }

    public void delete(Long id){
        ecoleRepository.deleteById(id);
    }

    public Ecole update(Long id, EcoleDTO ecoleDTO){
        Optional<Ecole> ecole = ecoleRepository.findById(id);

        ecole.get().setNomEcole(ecoleDTO.getNomEcole());
        ecole.get().setAdresseEcole(ecoleDTO.getAdresseEcole());

        return ecoleRepository.save(ecole.get());

    }
}
