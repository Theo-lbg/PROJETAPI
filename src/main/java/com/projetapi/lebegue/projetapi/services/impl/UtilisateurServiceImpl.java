package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.UtilisateurRepository;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import com.projetapi.lebegue.projetapi.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getUserById(String id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public Utilisateur createOrUpdateUser(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUser(String id) {
        utilisateurRepository.deleteById(id);
    }
}

