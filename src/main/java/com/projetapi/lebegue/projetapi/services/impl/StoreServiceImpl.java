package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.StoreRepository;
import com.projetapi.lebegue.projetapi.model.Store;
import com.projetapi.lebegue.projetapi.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public Store getStoreById(String id) {
        return storeRepository.findById(id).orElse(null);
    }

    @Override
    public Store createOrUpdateStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteStore(String id) {
        storeRepository.deleteById(id);
    }
}

