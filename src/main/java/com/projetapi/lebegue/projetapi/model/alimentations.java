package com.projetapi.lebegue.projetapi.model;
public class alimentations {

    private String id;
    private String nom;
    private String marque;
    private String puissance;
    private String modulaire;
    private String efficacite;
    private String description;
    private String prix;
    private String image;

    public alimentations(String id, String nom, String marque, String puissance, String modulaire, String efficacite, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.puissance = puissance;
        this.modulaire = modulaire;
        this.efficacite = efficacite;
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

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getModulaire() {
        return modulaire;
    }

    public void setModulaire(String modulaire) {
        this.modulaire = modulaire;
    }

    public String getEfficacite() {
        return efficacite;
    }

    public void setEfficacite(String efficacite) {
        this.efficacite = efficacite;
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