package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ObraDigital extends Obra {

	@Column(nullable = false)
	protected String url;

	public ObraDigital() {
	}

	public ObraDigital(Long id, String titulo, Date dataPublicacao, String url) {
		super(id, titulo, dataPublicacao);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
