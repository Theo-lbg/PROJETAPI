package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ComposantController {
    @Autowired
    private ComposantService composantService;
    @GetMapping("/composant")
    public ArrayList<Composant> findAll(){
        return composantService.findAll();
    }

    @GetMapping("/composant/{id}")
    public Composant findById(@PathVariable(name = "id") String id){
        return composantService.findById(id);
    }

    @PostMapping("/add")
    public void createComposant(@RequestBody Composant composant){
        composantService.createComposant(composant);
    }

    @PutMapping("/update/{id}/composant")
    public void updateComposant(@RequestBody Composant composant, @PathVariable(name = "id", required = true) String id){
        composantService.updateComposantById(id,composant);
    }

    @DeleteMapping("/delete/{id}/composant")
    public void deleteComposant(@PathVariable(name = "id") String id){
        composantService.deleteComposantById(id);
    }

}
