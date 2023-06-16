package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.DAO.UtilisateurRepository;
import com.projetapi.lebegue.projetapi.DTO.SaveCart;
import com.projetapi.lebegue.projetapi.exceptions.RessourceNotFoundException;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private ComposantRepository composantRepository;

    // Get all carts
    @GetMapping
    public ResponseEntity<List<Cart>> getAllCarts() {
        List<Cart> carts = cartRepository.findAll();
        return ResponseEntity.ok(carts);
    }

    // Get a cart by id
    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCartById(@PathVariable("id") int id) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            return ResponseEntity.ok(optionalCart.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Create a new cart
    @PostMapping
    public ResponseEntity<Cart> createCart(@RequestParam (value="name") String name, @RequestParam (value="user_id") int user_id) {
        Utilisateur user = utilisateurRepository.getReferenceById(user_id);
        Cart savedCart = new Cart();
        savedCart.setName(name);
        savedCart.setUser(user);
        if (user == null) {
            throw new RessourceNotFoundException();
        }
        user.setCart(savedCart);
        cartRepository.save(savedCart);
        return ResponseEntity.ok(savedCart);
    }

    // Add composant in cart
    @PostMapping("/{cartId}/addcomposant/{composantId}")
    public ResponseEntity<Cart> addComposantInCart(@PathVariable("cartId") int cartId, @RequestBody SaveCart cart, @PathVariable("composantId") int composantId) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        if (optionalCart.isPresent()) {
            //on fait nos popotes
            Optional<Composant> composantOptional = composantRepository.findById(composantId);
            if (composantOptional.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            optionalCart.get().getItems().add(composantOptional.get());
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            //on le créer puis affecte le produit
            Cart savedCart = new Cart();
            savedCart.setName(cart.getName());
            savedCart.setUser(utilisateurRepository.getById(cart.getUser_id()));
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

    // Update a cart by id
    @PutMapping("/{id}")
    public ResponseEntity<Cart> updateCart(@PathVariable("id") int id, @RequestBody Cart cart) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            cart.setCartid(id);
            Cart updatedCart = cartRepository.save(cart);
            return ResponseEntity.ok(updatedCart);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Delete a cart by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCartById(@PathVariable("id") int id) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            cartRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Get carts by user id
    @GetMapping("/findcartbyuser/{user_id}")
    public List<Cart> getCartsByUserId(@PathVariable("user_id") int userId) {
        return cartRepository.findByUserId(userId);
    }

}
