package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Composant;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public interface ComposantService {

    public ArrayList<Composant> findAll();
    Composant findById(String id);
    void updateComposantById(String id, Composant newComposant);
    void deleteComposantById(String id);
    String createComposant(Composant composant) throws ExecutionException, InterruptedException;
    Composant getComposantDetails(String composant) throws ExecutionException, InterruptedException;
}
