package com.projetapi.lebegue.projetapi.DAO;

import com.projetapi.lebegue.projetapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {


}
