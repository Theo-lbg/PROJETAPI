package com.projetapi.lebegue.projetapi.DAO;

import com.projetapi.lebegue.projetapi.model.Cart;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
    List<Cart> findAllByUtilisateur(Utilisateur utilisateur);
}

