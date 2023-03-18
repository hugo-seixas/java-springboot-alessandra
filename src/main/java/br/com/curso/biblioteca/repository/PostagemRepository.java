package br.com.curso.biblioteca.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.biblioteca.entity.Postagem;
import br.com.curso.biblioteca.enums.PlataformaDigital;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findByPlataforma(PlataformaDigital plataforma);

	public List<Postagem> findByConteudo(String conteudo);

	public Postagem findByUrl(String url);
	
	public List<Postagem> findByTitulo(String titulo);

	public List<Postagem> findByDataPublicacao(Date dataPublicacao);

}
