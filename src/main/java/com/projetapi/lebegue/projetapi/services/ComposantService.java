package com.projetapi.lebegue.projetapi.services;


import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.List;

public interface ComposantService {

    public List<Composant> findAll();

    public Composant findById(String id);

    public String create(Composant composant);

}
