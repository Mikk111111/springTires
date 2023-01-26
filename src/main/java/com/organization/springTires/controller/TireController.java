package com.organization.springTires.controller;

import com.organization.springTires.model.Tire;
import com.organization.springTires.service.TireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/Tire")
public class TireController {
    @Autowired
    private TireService tireService;

    @GetMapping(path = "/Specs/{specs]")
    public List<Tire> getTireSpecsLike(@PathVariable String specs){
        return tireService.getTireBySpecsLike(specs);
    }

}
