package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.List;

public interface ComposantService {

    List<Composant> getAllComposants();

    Composant getComposantById(Integer compoId);

    Composant saveComposant(Composant composant);

    void deleteComposantById(Integer compoId);

}

