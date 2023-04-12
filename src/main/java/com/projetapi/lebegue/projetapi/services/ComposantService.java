package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.ArrayList;

public interface ComposantService {

    ArrayList<Composant> findAll();

    Composant findById(String id);

    String create(Composant composant);

}
