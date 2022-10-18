package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.model.Eleve;
import com.tdsi.school_gestion.repository.ClasseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClasseService {
    private final ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public Optional<Classe> findByIndice(String indice){
        return classeRepository.findByIndice(indice);
    }

    public Classe create(String indice){
        Classe classe = new Classe();
        classe.setIndiceClasse(indice);
        return classeRepository.save(classe);
    }

    public Classe update(Long id,String newIndice){
        Optional<Classe> classe = classeRepository.findById(id);
        classe.get().setIndiceClasse(newIndice);

        return classeRepository.save(classe.get());
    }

    public void delete(Long id){
        classeRepository.deleteById(id);
    }

}
