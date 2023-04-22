package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    public List<Cart> getAllCarts();

    public Cart getCartById(String id);

    public List<Cart> getCartsByUser(Utilisateur utilisateur);

    public Cart createCart(Cart cart);

    public Cart updateCart(String id, Cart cart);

    public boolean deleteCart(String id);


}


