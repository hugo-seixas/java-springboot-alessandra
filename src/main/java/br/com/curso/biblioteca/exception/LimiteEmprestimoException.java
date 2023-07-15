package br.com.curso.biblioteca.exception;


@SuppressWarnings("serial")
public class LimiteEmprestimoException extends Exception{
	
	public LimiteEmprestimoException() {
		System.out.println("Limite excedido!");
	}

}
