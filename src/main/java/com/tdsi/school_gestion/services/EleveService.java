package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Eleve;
import com.tdsi.school_gestion.repository.EleveRepository;
import com.tdsi.school_gestion.services.dto.EleveDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveService {

    private final EleveRepository eleveRepository;

    public EleveService(EleveRepository eleveRepository) {
        this.eleveRepository = eleveRepository;
    }

    public Eleve create(EleveDTO eleveDTO){
        Eleve eleve = new Eleve();
        eleve.setNomEleve(eleveDTO.getNomEleve());
        eleve.setPrenomEleve(eleveDTO.getPrenomEleve());
        eleve.setEmail(eleveDTO.getEmail());
        eleve.setMatricule(eleveDTO.getMatricule());
        return eleveRepository.save(eleve);
    }

    public Optional<Eleve> findByEmail(String email){
        return eleveRepository.findByEmail(email);
    }

    public Optional<Eleve> findByTel(String tel){
        return eleveRepository.findByTel(tel);
    }

    public Optional<Eleve> findByMatricule(String matricule){
        return eleveRepository.findByMatricule(matricule);
    }

    public Optional<Eleve> findById(Long id){
        return eleveRepository.findById(id);
    }

    public List<Eleve> get(){
        return eleveRepository.findAll();
    }

    public void delete(Long id){
        eleveRepository.deleteById(id);
    }

    public Eleve update(Long id, EleveDTO eleveDTO){
        Optional<Eleve> eleve = eleveRepository.findById(id);
        eleve.get().setNomEleve(eleveDTO.getNomEleve());
        eleve.get().setPrenomEleve(eleveDTO.getPrenomEleve());
        eleve.get().setMatricule(eleveDTO.getMatricule());
        eleve.get().setEmail(eleveDTO.getEmail());
        eleve.get().setPassword(eleveDTO.getPassword());

        return eleveRepository.save(eleve.get());
    }

}
