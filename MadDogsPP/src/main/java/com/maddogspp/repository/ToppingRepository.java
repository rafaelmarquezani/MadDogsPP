package com.maddogspp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maddogspp.entities.Topping;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {

	List<Topping> findbyTipo(String tipo);
}
