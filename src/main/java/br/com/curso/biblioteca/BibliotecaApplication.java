package br.com.curso.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.curso.biblioteca.entity.Livro;
import br.com.curso.biblioteca.repository.LivroRepository;
import br.com.curso.biblioteca.service.EmprestimoService;

@SpringBootApplication
public class BibliotecaApplication {

	public static final Logger log = LoggerFactory.getLogger(BibliotecaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}
	
/*	@Bean
	public CommandLineRunner executar (LivroRepository livroRepository, EmprestimoService emprestimoService) {
		return (args) -> {
			
//			Apagando todos os livros
			livroRepository.deleteAll();
			
			String titulo = "Dom Casmurro";
			String autor = "Machado de Assis";
			String codLocalizacao = "ABC123";
			String isbn = "123456789";
			Date dataPublicacao = (new SimpleDateFormat("dd/MM/yyyy")).parse("12/03/1879");

			String titulo1 = "O diário de Anne Frank";
			String autor1 = "Anne Frank";
			String codLocalizacao1 = "XYZ123";
			String isbn1 = "987654321";
			Date dataPublicacao1 = (new SimpleDateFormat("dd/MM/yyyy")).parse("03/12/1877");
			
			Livro livro = new Livro(null, titulo, dataPublicacao, codLocalizacao, autor, isbn);
			Livro livro1 = new Livro(null, titulo1, dataPublicacao1, codLocalizacao1, autor1, isbn1);
			
			livro = livroRepository.save(livro);
			livro1 = livroRepository.save(livro1);
			
			log.info("Livro Cadastrado: ");
			log.info(livro.toString());
			
			log.info("Pesquisando um livro pelo ISBN");
			livro = livroRepository.findByIsbn(isbn);
			log.info(livro.toString());
			
			log.info("Pesquisar a quantos anos um livro foi publicado");
			Integer anosPublicacao = livroRepository.quantosAnosPublicacaoLivro(livro.getId());
			log.info("O livro " + livro.getTitulo() + " foi publicado a " + anosPublicacao + " anos.");
			
			log.info("Pesquisar livros ordenados por título");
			List<Livro> livros = livroRepository.buscaTodosOrdenadosTitulo();
			log.info(livros.toString());

			log.info("Pesquisar livros ordenados por autor");
			livros = livroRepository.buscaTodosOrdenadosAutor();
			log.info(livros.toString());

			log.info("Pesquisar o título do livro mais antigo");
			String tituloMaisAntigo = livroRepository.buscaMaisAntigo();
			log.info(tituloMaisAntigo.toString());
			
			log.info("Atualizando o ISBN de um livro");
			livroRepository.atualizaIsbnLivro(livro.getId(), "XXX");
			Optional<Livro> optLivro = livroRepository.findById(livro.getId());
			if(optLivro.isPresent()) {
				log.info(optLivro.get().toString());
			}
			
			log.info("Apagando um livro");
			livroRepository.apagaLivro(livro1.getId());
			optLivro = livroRepository.findById(livro1.getId());
			if(optLivro.isEmpty()) {
				log.info("Livro removido com sucesso");
			}
			
			// instanciar estudante e persistir no banco, chamando emprestimo service
			
			
		};
	}*/

}
