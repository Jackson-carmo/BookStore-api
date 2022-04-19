package com.jackson.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.jackson.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty(message = "Campo NOME é requerido!") // campo nome nao pode estar vazio
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres ") // Definindo Tamanho do nome
	private String nome;
	
	@NotEmpty(message = "Campo DESCRIÇÃO é requerido!") // campo descriçao nao pode estar vazio
	@Length(min = 3, max = 200, message = "O campo DESCRIÇÃO deve ter entre 3 e 200 caracteres ") // Definindo Tamanho do nome
	private String descricao;
	
	public CategoriaDTO() {
		
		super();
	}
	
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	
}
