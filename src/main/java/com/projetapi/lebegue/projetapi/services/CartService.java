package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllCarts();

    Cart getCartById(Integer id);

    Cart saveCart(Cart cart, Integer userId);

    Cart updateCart(Integer id, Cart cart);

    void deleteCart(Integer id);

}

