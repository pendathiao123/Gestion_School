package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Classe;
import com.tdsi.school_gestion.repository.ClasseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClasseService {
    private final ClasseRepository classeRepository;
    private final NiveauService niveauService;
    private final SerieService serieService;

    public ClasseService(ClasseRepository classeRepository, NiveauService niveauService, SerieService serieService) {
        this.classeRepository = classeRepository;
        this.niveauService = niveauService;
        this.serieService = serieService;
    }

    public Optional<Classe> findByIndice(String indice){
        return classeRepository.findByIndiceClasse(indice);
    }

    public Optional<Classe> findById(Long id){return classeRepository.findById(id);}

    public Classe create(String indice, Long idNiveau, Long idSerie){
        Classe classe = new Classe();
        classe.setIndiceClasse(indice);
        classe.setNiveau(niveauService.findById(idNiveau).get());
        classe.setSerie(serieService.findById(idSerie).get());
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
