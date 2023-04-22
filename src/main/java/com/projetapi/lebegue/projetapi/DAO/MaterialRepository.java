package com.projetapi.lebegue.projetapi.DAO;
import com.projetapi.lebegue.projetapi.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, String> {
}
