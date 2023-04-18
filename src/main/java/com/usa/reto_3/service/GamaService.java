package com.usa.reto_3.service;

import com.usa.reto_3.model.GamaModel;
import com.usa.reto_3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){
        return gamaRepository.findAll();
    }

    public void crear(GamaModel gama) {
        gamaRepository.save(gama);
    }
}
