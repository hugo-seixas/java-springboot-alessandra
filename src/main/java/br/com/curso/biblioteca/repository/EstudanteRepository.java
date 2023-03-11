package br.com.curso.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.curso.biblioteca.entity.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

	public Estudante findByEmail(String email);
	
	public Estudante findByMatricula(String matricula);

	@Query ("FROM Estudante e WHERE e.nome LIKE %:nome% OR e.rg LIKE %:rg%")
	public List<Estudante> findByNomeOuRG(String nome, String rg);

}
