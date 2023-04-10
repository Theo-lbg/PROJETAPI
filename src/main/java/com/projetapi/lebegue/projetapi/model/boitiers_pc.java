package com.projetapi.lebegue.projetapi.model;
public class boitiers_pc {

    private String id;
    private String nom;
    private String marque;
    private String format;
    private String type;
    private String ventilateurs;
    private String description;
    private String prix;
    private String image;

    public boitiers_pc(String id, String nom, String marque, String format, String type, String ventilateurs, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.format = format;
        this.type = type;
        this.ventilateurs = ventilateurs;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVentilateurs() {
        return ventilateurs;
    }

    public void setVentilateurs(String ventilateurs) {
        this.ventilateurs = ventilateurs;
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
