package br.com.curso.biblioteca.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name = "TB_PROFESSOR")
@MappedSuperclass
@PrimaryKeyJoinColumn(name = "idUsuario")
public class Professor extends Usuario {

	@Column(nullable = false)
	private String titulacao;
	
	public Professor() {
	}

	public Professor(Long id, String nome, String rg, String email, String titulacao) {
		super(id, nome, rg, email);
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return titulacao;
	}
	
	

}