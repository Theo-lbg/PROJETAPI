package com.projetapi.lebegue.projetapi.DAO;
import com.projetapi.lebegue.projetapi.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
}
