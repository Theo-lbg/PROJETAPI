package com.projetapi.lebegue.projetapi.model;

public class processeurs {
    private String id;
    private String nom;
    private String marque;
    private String socket;
    private String frequence;
    private String coeurs;
    private String threads;
    private String cache;
    private String gravure;
    private String description;
    private String prix;
    private String image;

    public processeurs(String id, String nom, String marque, String socket, String frequence, String coeurs, String threads, String cache, String gravure, String description, String prix, String image) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.socket = socket;
        this.frequence = frequence;
        this.coeurs = coeurs;
        this.threads = threads;
        this.cache = cache;
        this.gravure = gravure;
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

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getCoeurs() {
        return coeurs;
    }

    public void setCoeurs(String coeurs) {
        this.coeurs = coeurs;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getGravure() {
        return gravure;
    }

    public void setGravure(String gravure) {
        this.gravure = gravure;
    }

    public String getDescription () {
        return description;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public String getPrix () {
        return prix;
    }
    public void setPrix (String prix) {
        this.prix = prix;
    }
    public String getImage () {
        return image;
    }
    public void setImage (String image) {
        this.image = image;
    }
}
