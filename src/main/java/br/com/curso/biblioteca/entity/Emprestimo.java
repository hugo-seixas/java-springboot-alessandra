package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	public Emprestimo() {
	}

	public Emprestimo(Long id, Date data, Usuario usuario, Obra obra) {
		this.id = id;
		this.data = data;
		this.usuario = usuario;
		this.obra = obra;
	}

	public Long getId() {
		return id;
	}

	public Date getData() {
		return data;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Obra getObra() {
		return obra;
	}
	

}
