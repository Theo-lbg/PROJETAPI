package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.DAO.UtilisateurRepository;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import com.projetapi.lebegue.projetapi.services.UtilisateurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private CartRepository cartRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
//        Cart cart = new Cart();
//        cart.setName(utilisateur.getNom() + " " + utilisateur.getPrenom() + "'s cart");
//        cart.setUser(utilisateur);
//        utilisateur.setCart(cart);
        //Cart addCart = cartRepository.save(cart);
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur getUtilisateurById(int id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(int id, Utilisateur utilisateur) {
        Utilisateur utilisateurToUpdate = utilisateurRepository.findById(id).orElse(null);
        if (utilisateurToUpdate == null) {
            return null;
        }
        utilisateurToUpdate.setNom(utilisateur.getNom());
        utilisateurToUpdate.setPrenom(utilisateur.getPrenom());
        utilisateurToUpdate.setAdresse(utilisateur.getAdresse());
        utilisateurToUpdate.setCart(utilisateur.getCart());
        return utilisateurRepository.save(utilisateurToUpdate);
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

}
