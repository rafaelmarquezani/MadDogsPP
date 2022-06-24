package com.maddogspp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maddogspp.entities.Bebida;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Long> {

	List<Bebida> findbyTipo(String tipo);
	
	
}
