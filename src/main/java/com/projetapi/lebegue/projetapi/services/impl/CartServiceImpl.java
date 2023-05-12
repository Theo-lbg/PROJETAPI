package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import com.projetapi.lebegue.projetapi.services.CartService;
import com.projetapi.lebegue.projetapi.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final UtilisateurService utilisateurService;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, UtilisateurService utilisateurService) {
        this.cartRepository = cartRepository;
        this.utilisateurService = utilisateurService;
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCartById(Integer id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart saveCart(Cart cart, Integer userId) {
        Utilisateur user = utilisateurService.getUtilisateurById(userId);
        if (user == null) {
            return null;
        }
        cart.setUser(user);
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Integer id, Cart cart) {
        return null;
    }

    @Override
    public void deleteCart(Integer id) {
        cartRepository.deleteById(id);
    }
}
