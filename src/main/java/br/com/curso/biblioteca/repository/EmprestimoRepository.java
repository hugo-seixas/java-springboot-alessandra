package br.com.curso.biblioteca.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import br.com.curso.biblioteca.entity.Emprestimo;
import br.com.curso.biblioteca.entity.Usuario;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

	public List<Emprestimo> findByData(Date data);
	
	public List<Emprestimo> findByUsuario(Usuario usuario);
	
	@Procedure(name = "atrasos")
	public Integer quantidadeEmAtraso();


}
