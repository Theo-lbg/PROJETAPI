package com.projetapi.lebegue.projetapi.rest;

import java.util.List;

import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/composant")
public class ComposantController {

    @Autowired
    private ComposantService CompoService;

    @GetMapping
    public List<Composant> findAll() {
        return CompoService.findAll();
    }

    @GetMapping("/{id}")
    public Composant findById(@PathVariable("id") String identifiant) {
        Composant reponse = CompoService.findById(identifiant);
        if(reponse == null) {
            throw new ResourceNotFoundException();
        }
        return reponse;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String create(@RequestBody Composant composant) {
        return CompoService.create(composant);
    }
}
