package com.usa.reto_3.service;

import com.usa.reto_3.model.AdminModel;
import com.usa.reto_3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminModel> obtener(){
        return adminRepository.findAll();
    }

    public void crear(AdminModel admin){
        adminRepository.save(admin);
    }
}
