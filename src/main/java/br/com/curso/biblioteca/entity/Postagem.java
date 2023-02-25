package br.com.curso.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_POSTAGEM")
@PrimaryKeyJoinColumn(name = "idObra")
public class Postagem extends ObraDigital {
	
	
	@Override
	@Column(nullable = false)
	public String getUrl() {
		return super.getUrl();
	}
	
	@Column(nullable = false)
	private Enum plataforma;
	
	@Column(nullable = false)
	private String conteudo;
	
	public Postagem() {
	}
	
	public Postagem(Long id, String titulo, Date dataPublicacao, String url, Enum plataforma,String conteudo) {
		super(id, titulo, dataPublicacao, url);
		this.plataforma = plataforma;
		this.conteudo = conteudo;

	}

	public Enum getPlataforma() {
		return plataforma;
	}

	public String getConteudo() {
		return conteudo;
	}
	
	
	
	
}
