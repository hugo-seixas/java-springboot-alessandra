package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Estudante;

public interface EstudanteRepository extends UsuarioRepository {

	public Estudante findByMatricula(String matricula);


}
