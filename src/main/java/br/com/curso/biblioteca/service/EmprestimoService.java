package br.com.curso.biblioteca.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.curso.biblioteca.entity.Emprestimo;
import br.com.curso.biblioteca.entity.Obra;
import br.com.curso.biblioteca.entity.Usuario;
import br.com.curso.biblioteca.exception.LimiteEmprestimoException;
import br.com.curso.biblioteca.exception.UsuarioOuObraNulosException;
import br.com.curso.biblioteca.repository.EmprestimoRepository;
import br.com.curso.biblioteca.repository.UsuarioRepository;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository emprestimoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Transactional(rollbackFor = LimiteEmprestimoException.class)
	public void emprestarObra(Usuario usuario, Obra obra) throws LimiteEmprestimoException, UsuarioOuObraNulosException {
		
		if (usuario == null || obra == null) {
			throw new UsuarioOuObraNulosException();
		}
		
		if (usuario.getTotalEmprestimos() == null) {
			usuario.setTotalEmprestimos(1);
		} else {
			usuario.setTotalEmprestimos(usuario.getTotalEmprestimos() + 1);
		}
		
		usuarioRepository.save(usuario);
			
		int limiteDeEmprestimos = usuario.getLimiteEmprestimos(); 

		List<Emprestimo> listaDeEmprestimo = emprestimoRepository.findByUsuario(usuario);

		if (listaDeEmprestimo.size() < limiteDeEmprestimos) {
			Emprestimo emprestimo = new Emprestimo(null, new Date(), usuario, obra);
			emprestimoRepository.save(emprestimo);
		} else {
			throw new LimiteEmprestimoException();
		}
	}

//	@Transactional
//	public void emprestarObra(Emprestimo emprestimo) throws LimiteEmprestimoException {
//		
//		int limiteDeEmprestimos = emprestimo.getUsuario().getDiasEmprestimo(); 
//		
//		List<Emprestimo> listaDeEmprestimo = emprestimoRepository.findByUsuario(emprestimo.getUsuario());
//		
//		if (listaDeEmprestimo.size() < limiteDeEmprestimos) {
//			emprestimoRepository.save(emprestimo);
//		} else {
//			throw new LimiteEmprestimoException();
//		}
//	}

}
