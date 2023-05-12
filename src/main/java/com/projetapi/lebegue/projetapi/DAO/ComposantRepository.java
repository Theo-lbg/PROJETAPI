package com.projetapi.lebegue.projetapi.DAO;

import com.projetapi.lebegue.projetapi.model.Composant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposantRepository extends JpaRepository<Composant, Integer> {
}