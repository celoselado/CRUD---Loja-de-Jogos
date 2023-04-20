package com.generation.lojadejogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_jogos")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do jogo é obrigatório!")
	@Size(max = 50, message = "O limite de caracteres é de 50!")
	private String nome;
	
	@NotBlank(message = "O valor do jogo é obrigatório!")
	private String valor;
	
	@NotBlank(message = "Digite a recomendação de idade!")
	private String recIdade;

	@NotBlank(message = "Insira as plataformas disponíveis!")
	private String plataformas;
	
	@NotBlank(message = "Digite se o jogo é local ou multiplayer online!")
	@Size(min = 5, max = 18, message = "Minimo de 5 letras e máximo de 18!")
	private String localMult;
	
	@ManyToOne
	@JsonIgnoreProperties("jogo")
	private Genero genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getRecIdade() {
		return recIdade;
	}

	public void setRecIdade(String recIdade) {
		this.recIdade = recIdade;
	}

	public String getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(String plataformas) {
		this.plataformas = plataformas;
	}

	public String getLocalMult() {
		return localMult;
	}

	public void setLocalMult(String localMult) {
		this.localMult = localMult;
	} 

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
