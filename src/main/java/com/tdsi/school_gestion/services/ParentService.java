package com.tdsi.school_gestion.services;

import com.tdsi.school_gestion.repository.ParentsRepository;
import org.springframework.stereotype.Service;

@Service
public class ParentService {
    private final ParentsRepository parentsRepository;

    public ParentService(ParentsRepository parentsRepository) {
        this.parentsRepository = parentsRepository;
    }
}
