package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.exceptions.RessourceNotFoundException;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.model.memoires_ram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projetapi.lebegue.projetapi.DAO.memoires_ramRepository;

import java.util.ArrayList;

@RestController
public class ComposantController {

    @Autowired
    private ComposantRepository composantRepository;
    @Autowired
    private memoires_ramRepository memoires_ramRepository;

    @GetMapping("/composant")
    public ArrayList<Composant> findAll(){
        return (ArrayList<Composant>) composantRepository.findAll();
    }

    @GetMapping("/composant/{id}")
    public Composant findById(@PathVariable("id") String id){
        Composant response = composantRepository.findById(id).get();
        if (response == null) throw new RessourceNotFoundException();
        return response;
    }

    @GetMapping("/memoires_ram")
    public ArrayList<memoires_ram> findAllMemoires(){
        return (ArrayList<memoires_ram>) memoires_ramRepository.findAll();
    }

    @PostMapping("/composant/create")
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public Composant create (@RequestBody Composant composant){
        return composantRepository.save(composant);
    }

}
