package com.maddogspp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maddogspp.entities.Pao;

@Repository
public interface PaoRepository extends JpaRepository<Pao, Long>{

	List<Pao> findbyTipo(String tipo);
	
}
