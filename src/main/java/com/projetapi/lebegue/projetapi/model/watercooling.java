package com.projetapi.lebegue.projetapi.model;
public class watercooling {

    private String id;
    private String nom;
    private String marque;
    private String socket_compatible;
    private String type;
    private String description;
    private String prix;
    private String image;

    public watercooling(String id, String nom, String marque, String socket_compatible, String type, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.socket_compatible = socket_compatible;
        this.type = type;
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

    public String getSocket_compatible() {
        return socket_compatible;
    }

    public void setSocket_compatible(String socket_compatible) {
        this.socket_compatible = socket_compatible;
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
