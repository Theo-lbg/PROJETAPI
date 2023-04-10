package com.projetapi.lebegue.projetapi.model;
// ID          INT PRIMARY KEY,
//    Nom         VARCHAR(255),
//    Marque      VARCHAR(255),
//    Type        VARCHAR(255),
//    Description TEXT not null,
//    Prix        DECIMAL(10, 2),
//    Image       VARCHAR(255)
public class ventilateurs {

    private String id;
    private String nom;
    private String marque;
    private String type;
    private String description;
    private String prix;
    private String image;

    public ventilateurs(String id, String nom, String marque, String type, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
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
