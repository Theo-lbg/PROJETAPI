package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.ArrayList;

public interface ComposantService {

    public ArrayList<Composant> findAll();
    Composant findById(String id);
    void updateComposantById(String id, Composant newComposant);
    void deleteComposantById(String id);
    void createComposant(Composant composant);
}
