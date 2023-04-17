package com.projetapi.lebegue.projetapi.services;


import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.List;
import java.util.Map;

public interface ComposantService {

    public List<Composant> findAll();

    public Composant findById(String id);

    public String create(Composant composant);

    void update(String identifiant, Composant composant);

    void partialUpdate(String identifiant, Map<String, Object> updates);

    void delete(String identifiant);
}
