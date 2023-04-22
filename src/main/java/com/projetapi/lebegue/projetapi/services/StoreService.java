package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Store;

import java.util.List;

public interface StoreService {
    List<Store> getAllStores();

    Store getStoreById(String id);

    Store createOrUpdateStore(Store store);

    void deleteStore(String id);
}