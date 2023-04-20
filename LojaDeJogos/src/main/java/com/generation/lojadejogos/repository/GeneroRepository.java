package com.generation.lojadejogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadejogos.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
	
	public List<Genero> findAllByCategoriaContainingIgnoreCase(@Param("categoria")String categoria);
}
