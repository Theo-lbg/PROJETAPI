package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> getAllUsers();

    Utilisateur getUserById(String id);

    Utilisateur createOrUpdateUser(Utilisateur utilisateur);

    void deleteUser(String id);
}
