package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EXEMPLAR_REVISTA")
@PrimaryKeyJoinColumn(name = "idObra")
public class Revista extends ObraFisica {
	
	@Override
	@Column(nullable = false)
	public String getCodLocalizacao() {
		return super.getCodLocalizacao();
	}
	
	@Column(nullable = true)
	private Integer numero;

	public Revista() {
	}

	public Revista(Long id, String titulo, Date dataPublicacao, String codLocalizacao, Integer numero) {
		super(id, titulo, dataPublicacao, codLocalizacao);
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}
		
}
