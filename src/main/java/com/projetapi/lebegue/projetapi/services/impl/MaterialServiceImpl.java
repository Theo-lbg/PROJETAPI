package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.DAO.MaterialRepository;
import com.projetapi.lebegue.projetapi.model.Material;
import com.projetapi.lebegue.projetapi.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }
    @Override
    public Material getMaterialById(String id) {
        return materialRepository.findById(id).orElse(null);
    }

    @Override
    public Material createOrUpdateMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public void deleteMaterial(String id) {
        materialRepository.deleteById(id);
    }
}

