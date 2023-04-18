package com.usa.reto_3.service;

import com.usa.reto_3.model.CarModel;
import com.usa.reto_3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){
        return carRepository.findAll();
    }

    public void crear(CarModel car){
        carRepository.save(car);
    }
}
