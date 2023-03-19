package com.projetapi.lebegue.projetapi.model;

public class Composant {
    private String id;
    private static String nom;
    private String marque;
    private String type;
    private String description;
    private String prix;
    private String image;

    public Composant(String id, String nom, String marque, String type, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.type = type;
        this.description = description;
        this.prix = prix;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getNom() {
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

    @Override
    public String toString() {
        return "Composant [description=" + description + ", id=" + id + ", image=" + image + ", marque=" + marque + ", nom="
                + nom + ", prix=" + prix + ", type=" + type + "]";
    }
}
