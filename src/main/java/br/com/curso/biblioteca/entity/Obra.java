package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_EXEMPLAR_OBRA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Obra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(nullable = false)
	protected String titulo;
	
	@Column(nullable = false)
	protected Date dataPublicacao;
	
	public Obra() {
	}

	public Obra(Long id, String titulo, Date dataPublicacao) {
		this.id = id;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	
}
