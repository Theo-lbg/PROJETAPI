package com.projetapi.lebegue.projetapi.model;

public class cartes_meres {

    private String id;
    private String nom;
    private String marque;
    private String socket;
    private String format;
    private String chipset;
    private String ram_max;
    private String description;
    private String prix;
    private String image;

    public cartes_meres(String id, String nom, String marque, String socket, String format, String chipset, String ram_max, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.socket = socket;
        this.format = format;
        this.chipset = chipset;
        this.ram_max = ram_max;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getRam_max() {
        return ram_max;
    }

    public void setRam_max(String ram_max) {
        this.ram_max = ram_max;
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
