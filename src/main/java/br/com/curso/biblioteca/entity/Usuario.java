package br.com.curso.biblioteca.entity;

import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "TB_USUARIO")
public abstract class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(nullable = false)
	protected String nome;
	
	@Column(nullable = false)
	protected String rg;
	
	@Column(nullable = false)
	protected String email;
	
	@OneToMany(mappedBy = "usuario")
	protected List<Emprestimo> emprestimos;
	
	public Usuario() {
	}


	public Usuario(Long id, String nome, String rg, String email) {
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getRg() {
		return rg;
	}


	public String getEmail() {
		return email;
	}
	
	
	
	

}
