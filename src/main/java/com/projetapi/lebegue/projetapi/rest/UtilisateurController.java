package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import com.projetapi.lebegue.projetapi.services.UtilisateurService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;


    @GetMapping("/{userId}")
//    @Operation(summary = "Get a single utilisateur by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable int userId) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(userId);
        if (utilisateur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().body(utilisateur);
    }

    @PostMapping
//    @Operation(summary = "Create a new utilisateur")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public ResponseEntity<Utilisateur> addUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur savedUtilisateur = utilisateurService.addUtilisateur(utilisateur);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUtilisateur);
    }

    @PutMapping("/{userId}")
//    @Operation(summary = "Update utilisateur by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable int userId, @RequestBody Utilisateur utilisateur) {
        Utilisateur updatedUtilisateur = utilisateurService.updateUtilisateur(userId, utilisateur);
        if (updatedUtilisateur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().body(updatedUtilisateur);
    }

    @DeleteMapping("/{userId}")
//    @Operation(summary = "Delete utilisateur by id")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Success"),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error")
//    })
    public ResponseEntity<Void> deleteUtilisateur(@PathVariable int userId) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(userId);
        if (utilisateur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        utilisateurService.deleteUtilisateur(utilisateur);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        return ResponseEntity.ok().body(utilisateurs);
    }
}
