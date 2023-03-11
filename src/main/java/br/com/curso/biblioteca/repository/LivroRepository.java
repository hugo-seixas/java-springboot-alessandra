package br.com.curso.biblioteca.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.curso.biblioteca.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	public Livro findByIsbn(String isbn);

	@Query ("FROM Livro l WHERE l.autor LIKE %:autor% OR l.titulo LIKE %:titulo%")
	public List<Livro> findByAutorOuTitulo(String autor, String titulo);

	public List<Livro> findByCodLocalizacao(String getCodLocalizacao);

	public List<Livro> findByDataPublicacao(Date dataPublicacao);

}
