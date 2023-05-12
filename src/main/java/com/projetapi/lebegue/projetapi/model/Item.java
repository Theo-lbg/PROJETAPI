//package com.projetapi.lebegue.projetapi.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.*;
//import jakarta.persistence.Table;
//import org.hibernate.annotations.*;
//
//@Entity
//@Table(name = "item")
//public class Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne( fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "cart_id", nullable = false)
//    private Cart cart;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "compo_id", nullable = false)
//    private Composant composant;
//
//}
