package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.projetapi.lebegue.projetapi.model.Utilisateur;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable String id) {
        return cartService.getCartById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getCartsByUser(@PathVariable String userId) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(userId);
        return cartService.getCartsByUser(utilisateur);
    }

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }

    @PutMapping("/{id}")
    public Cart updateCart(@PathVariable String id, @RequestBody Cart cart) {
        return cartService.updateCart(id, cart);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCart(@PathVariable String id) {
        return cartService.deleteCart(id);
    }
}
