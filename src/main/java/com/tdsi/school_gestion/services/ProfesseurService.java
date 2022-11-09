package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Matiere;
import com.tdsi.school_gestion.model.Professeur;
import com.tdsi.school_gestion.repository.ProfesseurRepository;
import com.tdsi.school_gestion.services.dto.ProfesseurDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurService {
    private final ProfesseurRepository professeurRepository;

    public ProfesseurService(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    public Optional<Professeur> findById(Long id){
        return professeurRepository.findById(id);
    }

    public List<Professeur> getAll(){
        return professeurRepository.findAll();

    }

    public Professeur create(ProfesseurDTO professeurDTO){
        Professeur professeur = new Professeur();
        professeur.setEmail(professeurDTO.getEmail());
        professeur.setLogin(professeurDTO.getLogin());
        professeur.setPrenom(professeurDTO.getPrenom());
        professeur.setNom(professeurDTO.getNom());
        professeur.setTel(professeurDTO.getTel());

        return professeurRepository.save(professeur);
    }

    public Professeur update(Long id, ProfesseurDTO professeurDTO){
        Professeur professeur = findById(id).get();
        professeur.setTel(professeurDTO.getTel());
        professeur.setPrenom(professeurDTO.getPrenom());
        professeur.setNom(professeurDTO.getNom());
        professeur.setEmail(professeurDTO.getEmail());
        professeur.setPassword(professeurDTO.getPassword());
        professeur.setLogin(professeurDTO.getLogin());

        return professeurRepository.save(professeur);

    }

    public void delete(Long id){
        professeurRepository.deleteById(id);
    }




}
