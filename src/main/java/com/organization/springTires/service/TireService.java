package com.organization.springTires.service;

import com.organization.springTires.model.Tire;
import com.organization.springTires.repository.TireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TireService {

    @Autowired
    private TireRepository tireRepository;
    public List<Tire> getTireBySpecsLike(String specs){
        return tireRepository.getTireSpecsLike(specs);
    }
}
