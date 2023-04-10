package com.projetapi.lebegue.projetapi.model;

public class memoires_ram {
    private String id;
    private String nom;
    private String marque;
    private String capacité;
    private String type;
    private String fréquence;
    private String latence;
    private String description;
    private String prix;
    private String image;

    public memoires_ram(String id, String nom, String marque, String capacité, String type, String fréquence, String latence, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.capacité = capacité;
        this.type = type;
        this.fréquence = fréquence;
        this.latence = latence;
        this.description = description;
        this.prix = prix;
        this.image = image;
    }

    // GETTER AND SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCapacité() {
        return capacité;
    }

    public void setCapacité(String capacité) {
        this.capacité = capacité;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFréquence() {
        return fréquence;
    }

    public void setFréquence(String fréquence) {
        this.fréquence = fréquence;
    }

    public String getLatence() {
        return latence;
    }

    public void setLatence(String latence) {
        this.latence = latence;
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