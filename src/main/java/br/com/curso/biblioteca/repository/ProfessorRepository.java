package br.com.curso.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.curso.biblioteca.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	public List<Professor> findByTitulacao(String titulacao);

	@Query ("FROM Professor p WHERE p.nome LIKE %:nome% OR p.rg LIKE %:rg%")
	public List<Professor> findByNomeOuRG(String nome, String rg);
	
	public Professor findByEmail(String email);

}
