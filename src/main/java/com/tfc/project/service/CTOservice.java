package com.tfc.project.service;

import com.tfc.project.repository.CTOrepository;
import org.springframework.stereotype.Service;

@Service
public class CTOservice {
    private final CTOrepository ctoRepository;

    public CTOservice(CTOrepository ctoRepository) {
        this.ctoRepository = ctoRepository;
    }

}
