package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.UtilisateurRepository;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping()
    public List<Utilisateur> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Utilisateur getUserById(@PathVariable String id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @PostMapping()
    public Utilisateur createUser(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @PutMapping("/{id}")
    public Utilisateur updateUser(@PathVariable String id, @RequestBody Utilisateur utilisateur) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(id).orElse(null);
        if (existingUtilisateur != null) {
            existingUtilisateur.setFirstName(utilisateur.getFirstName());
            existingUtilisateur.setLastName(utilisateur.getLastName());
            existingUtilisateur.setAddress(utilisateur.getAddress());
            return utilisateurRepository.save(existingUtilisateur);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        utilisateurRepository.deleteById(id);
    }
}
