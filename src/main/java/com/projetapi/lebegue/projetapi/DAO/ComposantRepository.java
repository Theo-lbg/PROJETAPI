package com.projetapi.lebegue.projetapi.DAO;
import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.model.memoires_ram;
import org.springframework.data.repository.CrudRepository;

public interface ComposantRepository extends CrudRepository<Composant, String> {
}

