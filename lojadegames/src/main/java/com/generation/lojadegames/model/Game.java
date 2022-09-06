package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo nome deve conter no minimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo descrição deve conter no minimo 10 e no máximo 1000 caracteres")
	private String descricao;
	
	@NotNull(message = "Tipo de gênero é obrigatório!")
	@Size(min = 5, max = 20, message = "O atributo gênero deve conter no minimo 05 e no máximo 100 caracteres")
	private String genero;
	
	@NotNull(message = "O atributo restrição de idade é obrigatório!")
	private Long restricao_de_idade;
	
	@ManyToOne
	@JsonIgnoreProperties("game")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getRestricao_de_idade() {
		return restricao_de_idade;
	}

	public void setRestricao_de_idade(Long restricao_de_idade) {
		this.restricao_de_idade = restricao_de_idade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
