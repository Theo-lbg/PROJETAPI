package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.CartRepository;
import com.projetapi.lebegue.projetapi.DAO.ComposantRepository;
import com.projetapi.lebegue.projetapi.DAO.ItemRepository;
import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.model.Item;
import com.projetapi.lebegue.projetapi.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private  CartRepository cartRepository;
    @Autowired
    private  ComposantRepository composantRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(int itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    @Override
    public Item addItemToCart(int cartId, Item item) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart == null) {
            return null;
        }

        Composant composant = composantRepository.findById(item.getComposant().getCompoId()).orElse(null);
        if (composant == null) {
            return null;
        }

        item.setCart(cart);
        item.setComposant(composant);

        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        item.getCart().getItems().remove(item);
        item.getComposant().getItems().remove(item);
        itemRepository.delete(item);
    }

    @Override
    public List<Item> getItemsInCart(int cartId) {
//        Cart cart = cartRepository.findById(cartId).orElse(null);
//        if (cart == null) {
//            return null;
//        }
//
//        return cart.getItems();
        return null;
    }
}
