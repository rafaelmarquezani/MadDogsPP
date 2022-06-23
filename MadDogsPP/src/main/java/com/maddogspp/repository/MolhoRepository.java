package com.maddogspp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maddogspp.entities.Molho;

@Repository
public interface MolhoRepository extends JpaRepository<Molho, Long> {

	List<Molho> findbyid (String idProduto);
	List<Molho> findbyTipo(String tipo);
}
