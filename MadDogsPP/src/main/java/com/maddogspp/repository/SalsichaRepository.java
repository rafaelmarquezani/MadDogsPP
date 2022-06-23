package com.maddogspp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maddogspp.entities.Salsicha;

@Repository
public interface  SalsichaRepository extends JpaRepository<Salsicha, Long> {

	List<Salsicha> findbyTipo(String tipo);
}
