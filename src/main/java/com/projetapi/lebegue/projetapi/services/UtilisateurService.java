package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Utilisateur;
import jdk.jshell.execution.Util;

import java.util.List;

public interface UtilisateurService {

    Utilisateur getUtilisateurById(int id);

    Utilisateur addUtilisateur(Utilisateur utilisateur);

    void deleteUtilisateur(Utilisateur utilisateur);

    Utilisateur updateUtilisateur(int id, Utilisateur utilisateur);

    List<Utilisateur> getAllUtilisateurs();

}
