package com.usa.reto_3.service;

import com.usa.reto_3.model.ScoreModel;
import com.usa.reto_3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> obtener(){
        return scoreRepository.findAll();
    }

    public void crear(ScoreModel score){
        scoreRepository.save(score);
    }
}
