package br.com.curso.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.curso.biblioteca.entity.Livro;
import br.com.curso.biblioteca.repository.LivroRepository;

@SpringBootApplication
public class BibliotecaApplication {

	public static final Logger log = LoggerFactory.getLogger(BibliotecaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner executar (LivroRepository livroRepository) {
		return (args) -> {
			
//			Apagando todos os livros
			livroRepository.deleteAll();
			
			String titulo = "Dom Casmurro";
			String autor = "Machado de Assis";
			String codLocalizacao = "ABC123";
			String isbn = "123456789";
			Date dataPublicacao = (new SimpleDateFormat("dd/MM/yyyy")).parse("12/03/1879");
			
			Livro livro = new Livro(null, titulo, dataPublicacao, codLocalizacao, autor, isbn);
			
			livro = livroRepository.save(livro);
			
			log.info("Livro Cadastrado: ");
			log.info(livro.toString());
			
			log.info("Pesquisando um livro pelo ISBN");
			livro = livroRepository.findByIsbn(isbn);
			log.info(livro.toString());
		};
	}

}
