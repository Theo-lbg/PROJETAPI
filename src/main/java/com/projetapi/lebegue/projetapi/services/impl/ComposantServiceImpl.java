package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
        if (CompoRepository.findById(id).isPresent()) {
            return CompoRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public String create(Composant composant) {
        return CompoRepository.save(composant).getId();
    }

    @Override
    public void update(String identifiant, Composant composant) {
        composant.setId(identifiant);
        CompoRepository.save(composant);
    }

    @Override
    public void partialUpdate(String identifiant, Map<String, Object> updates) {
        Composant compo = CompoRepository.findById(identifiant).get();
        for (String key : updates.keySet()) {
            switch (key) {
                case "nom":
                    compo.setNom((String) updates.get(key));
                    break;
                case "marque":
                    compo.setMarque((String) updates.get(key));
                    break;
                case "type":
                    compo.setType((String) updates.get(key));
                    break;
                case "description":
                    compo.setDescription((String) updates.get(key));
                    break;
                case "prix":
                    compo.setPrix((String) updates.get(key));
                    break;
                case "image":
                    compo.setImage((String) updates.get(key));
                    break;
                default:
                    break;
            }
        }

        CompoRepository.save(compo);
    }

    @Override
    public void delete(String identifiant) {
        CompoRepository.deleteById(identifiant);
    }


}
