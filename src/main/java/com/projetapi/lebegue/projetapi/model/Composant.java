package com.projetapi.lebegue.projetapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Table(name = "composant")
@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compo_id")
    private Integer compoId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "marque")
    private String marque;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "prix")
    private String prix;

    @Column(name = "image")
    private String image;

    @ManyToMany
    @JoinTable(
            name = "Item",
            joinColumns = @JoinColumn(name = "compo_id"),
            inverseJoinColumns = @JoinColumn(name = "cart_id"))
    private List<Cart> items = new ArrayList<>();

//    @OneToMany(mappedBy = "composant", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Composant> items = new ArrayList<>();

    public List<Cart> getItems() {
        return items;
    }

    public Integer getCompoId() {
        return compoId;
    }

    public void setCompoId(Integer compoId) {
        this.compoId = compoId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
