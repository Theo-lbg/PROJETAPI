package com.projetapi.lebegue.projetapi.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


import java.util.HashSet;
import java.util.Set;

@Table(name = "cart")
@Entity
public class Cart {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Utilisateur_id")
    private Utilisateur utilisateur;

    @Column(name = "cart_name")
    private String cartName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "cart_material",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id"))
    private Set<Material> materials = new HashSet<>();

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }
}
