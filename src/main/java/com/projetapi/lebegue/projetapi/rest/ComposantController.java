package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.exceptions.RessourceNotFoundException;
import com.projetapi.lebegue.projetapi.model.Composant;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

@RestController
@RequestMapping("/composants")
public class ComposantController {

    @Autowired
    private ComposantRepository composantRepository;

    // Get All Composants
//    @Operation(summary = "Get all composants")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    @GetMapping()
    public List<Composant> getAllComposants() {
        return composantRepository.findAll();
    }

    // Create a new Composant
//    @Operation(summary = "Create a new composant")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    @PostMapping()
    public List<Composant> createComposant(@RequestBody List<Composant> composant) {
        return composantRepository.saveAll(composant);
    }

    // Get a Single Composant
//    @Operation(summary = "Get a single composant by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    @GetMapping("/{id}")
    public Composant getComposantById(@PathVariable(value = "id") Integer compoId) {
        return composantRepository.findById(compoId)
                .orElseThrow(() -> new RessourceNotFoundException());
    }

    // Update a Composant
    @PutMapping("/{id}")
//    @Operation(summary = "Update composant by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public Composant updateComposant(@PathVariable(value = "id") Integer compoId, @RequestBody Composant compoDetails) {

        Composant compo = composantRepository.findById(compoId)
                .orElseThrow(() -> new RessourceNotFoundException());

        compo.setNom(compoDetails.getNom());
        compo.setMarque(compoDetails.getMarque());
        compo.setType(compoDetails.getType());
        compo.setDescription(compoDetails.getDescription());
        compo.setPrix(compoDetails.getPrix());
        compo.setImage(compoDetails.getImage());

        Composant updatedCompo = composantRepository.save(compo);
        return updatedCompo;
    }

    // Delete a Composant
    @DeleteMapping("/{id}")
//    @Operation(summary = "Delete composant by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public ResponseEntity<?> deleteComposant(@PathVariable(value = "id") Integer compoId) {
        Composant compo = composantRepository.findById(compoId)
                .orElseThrow(() -> new RessourceNotFoundException());

        composantRepository.delete(compo);

        return ResponseEntity.ok().build();
    }
}