package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Matiere;
import com.tdsi.school_gestion.repository.MatiereRepository;
import com.tdsi.school_gestion.services.dto.MatiereDTO;
import lombok.Data;

@Data
public class MatiereService {
    private final MatiereRepository matiereRepository;

    public Matiere create(MatiereDTO matiereDTO){
        Matiere matiere = new Matiere();
        matiere.setNomMatiere(matiereDTO.getNomMatiere());
        matiere.setDescription(matiereDTO.getDescription());

        return matiereRepository.save(matiere);
    }

    public void delete(Long id){
        matiereRepository.deleteById(id);
     }

}
