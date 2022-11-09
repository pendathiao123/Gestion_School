package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Parents;
import com.tdsi.school_gestion.repository.ParentsRepository;
import com.tdsi.school_gestion.services.dto.ParentsDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParentService {
    private final ParentsRepository parentsRepository;

    public ParentService(ParentsRepository parentsRepository) {
        this.parentsRepository = parentsRepository;
    }

    public Parents create(ParentsDTO parentsDTO){
        Parents parent = new Parents();
        parent.setPrenom(parentsDTO.getPrenom());
        parent.setNom(parentsDTO.getNom());
        parent.setEmail(parentsDTO.getEmail());
        parent.setTel(parentsDTO.getTel());
        parent.setAdresse(parentsDTO.getAdresse());

        return parentsRepository.save(parent);

    }

    public Optional<Parents> findByEmail(String email){
        return parentsRepository.findByEmail(email);
    }

    public Optional<Parents> findByTel(String tel){
        return parentsRepository.findByTel(tel);
    }

    public Parents update(Long id, ParentsDTO parentsDTO){
        Parents parents = parentsRepository.findById(id).get();

        parents.setAdresse(parentsDTO.getAdresse());
        parents.setEmail(parentsDTO.getEmail());
        parents.setPrenom(parentsDTO.getPrenom());
        parents.setNom(parentsDTO.getNom());
        parents.setTel(parentsDTO.getTel());
        return parentsRepository.save(parents);

    }

    public void delete(Long id){
        parentsRepository.deleteById(id);
    }

}
