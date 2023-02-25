package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ObraFisica extends Obra {
	
	protected String codLocalizacao;

	public ObraFisica() {
	}

	public ObraFisica(Long id, String titulo, Date dataPublicacao, String codLocalizacao) {
		super(id, titulo, dataPublicacao);
		this.codLocalizacao = codLocalizacao;
	}

	public String getCodLocalizacao() {
		return codLocalizacao;
	}
	
	
	

}
