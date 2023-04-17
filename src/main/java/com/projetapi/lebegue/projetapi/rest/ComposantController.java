package com.projetapi.lebegue.projetapi.rest;

import java.util.List;
import java.util.Map;

import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import com.projetapi.lebegue.projetapi.util.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


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
        Control.checkFound(reponse);
        return reponse;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String create(@RequestBody Composant composant) {
        return CompoService.create(composant);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void update (@PathVariable("id") String identifiant, @RequestBody Composant composant) {
        Control.checkFound(CompoService.findById(identifiant));
        CompoService.update(identifiant, composant);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void partialUpdate (@PathVariable("id") String identifiant, @RequestBody Map<String, Object> updates) {
        Control.checkFound(CompoService.findById(identifiant));
        CompoService.partialUpdate(identifiant, updates);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deletebyID(@PathVariable("id") String identifiant) {
        Control.checkFound(CompoService.findById(identifiant));
        CompoService.delete(identifiant);
    }
}
