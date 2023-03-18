package br.com.curso.biblioteca.repository;

import java.util.List;

import br.com.curso.biblioteca.entity.Professor;

public interface ProfessorRepository extends UsuarioRepository {

	public List<Professor> findByTitulacao(String titulacao);


}
