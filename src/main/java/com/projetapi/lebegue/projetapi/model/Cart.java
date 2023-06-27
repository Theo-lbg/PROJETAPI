package com.projetapi.lebegue.projetapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cartid;

    @Column(name = "name")
    private String name;

    @OneToOne(targetEntity = Utilisateur.class, fetch = FetchType.LAZY, optional = false)
    private Utilisateur user;

    public List<Composant> getItems() {
        return items;
    }

    public void setItems(List<Composant> items) {
        this.items = items;
    }

    @ManyToMany
    @JoinTable(
            name = "Item",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "compo_id"))
    private List<Composant> items = new ArrayList<>();

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

}
