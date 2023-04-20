package com.generation.lojadejogos.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_generos")
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Digite a categoria do jogo!")
	@Size(max = 30, message = "Máximo de 30 caracteres!")
	private String categoria;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "genero", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("genero")
	private List<Jogo> jogo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public List<Jogo> getJogo() {
		return jogo;
	}

	public void setJogo(List<Jogo> jogo) {
		this.jogo = jogo;
	}

}
