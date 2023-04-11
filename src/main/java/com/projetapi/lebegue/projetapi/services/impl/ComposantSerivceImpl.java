package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ComposantSerivceImpl implements ComposantService {

    private ComposantRepository compoRepository;

    @Override
    public ArrayList<Composant> findAll() {
        ArrayList<Composant> composants = new ArrayList<>();
        compoRepository.findAll().forEach(composants::add);
        return composants;
    }

    @Override
    public Composant findById(String id) {
        return compoRepository.findById(id).get();
    }
}
