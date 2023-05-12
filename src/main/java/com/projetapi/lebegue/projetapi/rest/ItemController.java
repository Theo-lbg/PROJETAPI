//package com.projetapi.lebegue.projetapi.rest;
//
//import com.projetapi.lebegue.projetapi.model.Composant;
//import com.projetapi.lebegue.projetapi.model.Item;
//import com.projetapi.lebegue.projetapi.services.ItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/items")
//public class ItemController {
//
//    @Autowired
//    private ItemService itemService;
//
//    @GetMapping
//    public List<Item> getAllItems() {
//        List<Item> items = itemService.getAllItems();
//        return items;
//    }
//
//    @GetMapping("/{itemId}")
//    public ResponseEntity<Item> getItemById(@PathVariable int itemId) {
//        Item item = itemService.getItemById(itemId);
//        if (item == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return ResponseEntity.ok().body(item);
//    }
//
//    @PostMapping("/{cartId}")
//    public ResponseEntity<Item> addItemToCart(@PathVariable int cartId, @RequestBody Item item) {
//        Composant composant = item.getComposant();
//        if (composant == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        Item savedItem = itemService.addItemToCart(cartId, item);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
//    }
//
//    @DeleteMapping("/{itemId}")
//    public ResponseEntity<Void> deleteItem(@PathVariable int itemId) {
//        Item item = itemService.getItemById(itemId);
//        if (item == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        itemService.deleteItem(item);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/cart/{cartId}")
//    public ResponseEntity<List<Item>> getItemsInCart(@PathVariable int cartId) {
//        List<Item> items = itemService.getItemsInCart(cartId);
//        return ResponseEntity.ok().body(items);
//    }
//}
