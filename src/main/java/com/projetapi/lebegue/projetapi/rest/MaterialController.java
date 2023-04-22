package com.projetapi.lebegue.projetapi.rest;

import com.projetapi.lebegue.projetapi.DAO.MaterialRepository;
import com.projetapi.lebegue.projetapi.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping()
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Material getMaterialById(@PathVariable String id) {
        return materialRepository.findById(id).orElse(null);
    }

    @PostMapping()
    public Material createMaterial(@RequestBody Material material) {
        return materialRepository.save(material);
    }

    @PutMapping("/{id}")
    public Material updateMaterial(@PathVariable String id, @RequestBody Material material) {
        Material existingMaterial = materialRepository.findById(id).orElse(null);
        if (existingMaterial != null) {
            existingMaterial.setName(material.getName());
            existingMaterial.setImage(material.getImage());
            existingMaterial.setUser(material.getUser());
            return materialRepository.save(existingMaterial);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable String id) {
        materialRepository.deleteById(id);
    }
}

