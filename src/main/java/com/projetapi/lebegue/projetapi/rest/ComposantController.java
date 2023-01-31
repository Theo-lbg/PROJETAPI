package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ComposantController {
    @Autowired
    private ComposantService composantService;
    @GetMapping("/composant")
    public ArrayList<Composant> findAll(){
        return composantService.findAll();
    }
}
