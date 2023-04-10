package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.model.memoires_ram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/memoires_ram")
    public ArrayList<memoires_ram> findAllMemoires(){
        return (ArrayList<memoires_ram>) memoires_ramRepository.findAll();
    }
//    public Composant findById(String id){
//        return composantService.findById(id);
//    }

}
