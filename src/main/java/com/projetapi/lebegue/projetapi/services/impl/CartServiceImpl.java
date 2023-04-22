package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import com.projetapi.lebegue.projetapi.services.CartService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(String id) {
        return cartRepository.findById(id).orElse(null);
    }

    public List<Cart> getCartsByUser(Utilisateur utilisateur) {
        return cartRepository.findAllByUtilisateur(utilisateur);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(String id, Cart cart) {
        Cart cartToUpdate = getCartById(id);
        if (cartToUpdate == null) {
            return null;
        }
        cartToUpdate.setCartName(cart.getCartName());
        return cartRepository.save(cartToUpdate);
    }

    public boolean deleteCart(String id) {
        Cart cartToDelete = getCartById(id);
        if (cartToDelete == null) {
            return false;
        }
        cartRepository.delete(cartToDelete);
        return true;
    }
}
