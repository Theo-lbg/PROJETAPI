package com.projetapi.lebegue.projetapi.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Table(name="materials")
@Entity
public class Material {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String name;
    private String image;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "material")
    private List<Composant> components = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Utilisateur getUser() {
        return utilisateur;
    }

    public void setUser(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<Composant> getComponents() {
        return components;
    }

    public void setComponents(List<Composant> components) {
        this.components = components;
    }

    //getter and setter


}

