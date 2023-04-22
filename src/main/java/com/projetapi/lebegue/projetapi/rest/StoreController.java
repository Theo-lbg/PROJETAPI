package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.StoreRepository;
import com.projetapi.lebegue.projetapi.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping()
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable String id) {
        return storeRepository.findById(id).orElse(null);
    }

    @PostMapping()
    public Store createStore(@RequestBody Store store) {
        return storeRepository.save(store);
    }

    @PutMapping("/{id}")
    public Store updateStore(@PathVariable String id, @RequestBody Store store) {
        Store existingStore = storeRepository.findById(id).orElse(null);
        if (existingStore != null) {
            existingStore.setName(store.getName());
            return storeRepository.save(existingStore);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable String id) {
        storeRepository.deleteById(id);
    }
}

