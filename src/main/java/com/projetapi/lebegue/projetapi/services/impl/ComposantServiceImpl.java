package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComposantServiceImpl implements ComposantService {

    @Autowired
    private ComposantRepository composantRepository;

    @Override
    public List<Composant> getAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant getComposantById(Integer compoId) {
        return composantRepository.findById(compoId).orElse(null);
    }

    @Override
    public List<Composant> saveComposant(List<Composant> composant) {
        return composantRepository.saveAll(composant);
    }

    @Override
    public void deleteComposantById(Integer compoId) {
        composantRepository.deleteById(compoId);
    }
}
