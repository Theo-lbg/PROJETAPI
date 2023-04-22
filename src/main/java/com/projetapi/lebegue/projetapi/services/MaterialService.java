package com.projetapi.lebegue.projetapi.services;

import com.projetapi.lebegue.projetapi.model.Material;

import java.util.List;

public interface MaterialService {

    List<Material> getAllMaterials();

    Material getMaterialById(String id);

    Material createOrUpdateMaterial(Material material);

    void deleteMaterial(String id);


}
