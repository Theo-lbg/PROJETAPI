package com.projetapi.lebegue.projetapi.model;
public class cartes_graphique {

    private String id;
    private String nom;
    private String marque;
    private String chipset;
    private String vram;
    private String frequence;
    private String description;
    private String prix;
    private String image;

    public cartes_graphique(String id, String nom, String marque, String chipset, String vram, String frequence, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.chipset = chipset;
        this.vram = vram;
        this.frequence = frequence;
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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getVram() {
        return vram;
    }

    public void setVram(String vram) {
        this.vram = vram;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
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
