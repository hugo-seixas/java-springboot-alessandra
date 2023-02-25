package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", referencedColumnName = "id")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "idObra", referencedColumnName = "id")
	private Obra obra;
	
	@Column(nullable = false)
	private Date data;
	
	public Emprestimo() {
	}

	public Emprestimo(Long id, Date data) {
		this.id = id;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public Date getData() {
		return data;
	}
	

}
