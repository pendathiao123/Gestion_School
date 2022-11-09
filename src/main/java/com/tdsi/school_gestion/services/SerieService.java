package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.model.Serie;
import com.tdsi.school_gestion.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

   // public Optional<Serie> findByCode(String code){
       // return serieRepository.findByCodeSerie(code);
    //}

    public Optional<Serie> findById(Long id){return serieRepository.findById(id);}
    public Serie create(String code){
        Serie serie = new Serie();
        serie.setCode_serie(code);

        return serieRepository.save(serie);
    }

    public Serie update(Long id, String code){
        Serie serie = serieRepository.findById(id).get();
        serie.setCode_serie(code);

        return serieRepository.save(serie);
    }

    public void delete(Long id){
        serieRepository.deleteById(id);
    }

}
