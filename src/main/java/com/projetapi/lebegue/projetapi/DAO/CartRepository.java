package com.projetapi.lebegue.projetapi.DAO;

import com.projetapi.lebegue.projetapi.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query("SELECT c FROM Cart c WHERE c.user.userId = :userId")
    List<Cart> findByUserId(@Param("userId") int userId);
}
