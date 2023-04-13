package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ComposantServiceImpl implements ComposantService {

    @Autowired
    private ComposantRepository CompoRepository;

    @Override
    public List<Composant> findAll() {
        List<Composant> liste = new ArrayList<Composant>();
        CompoRepository.findAll().forEach(liste::add);
        return liste;
    }

    @Override
    public Composant findById(String id) {
        if(CompoRepository.findById(id).isPresent()) {
            return CompoRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public String create(Composant composant) {
        return CompoRepository.save(composant).getId();
    }

}
