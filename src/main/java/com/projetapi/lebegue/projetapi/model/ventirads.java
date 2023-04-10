package com.projetapi.lebegue.projetapi.model;
public class ventirads {

    private String id;
    private String nom;
    private String marque;
    private String socket;
    private String type;
    private String niveau_bruit;
    private String description;
    private String prix;
    private String image;

    public ventirads(String id, String nom, String marque, String socket, String type, String niveau_bruit, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.socket = socket;
        this.type = type;
        this.niveau_bruit = niveau_bruit;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNiveau_bruit() {
        return niveau_bruit;
    }

    public void setNiveau_bruit(String niveau_bruit) {
        this.niveau_bruit = niveau_bruit;
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
