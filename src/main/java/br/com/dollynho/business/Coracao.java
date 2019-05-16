package br.com.dollynho.business;

import br.com.dollynho.injection.AutoDollyInjection;

public class Coracao {

	public String getMensagem() {
		return "O Amor precisa de injeção!";
	}

	//Construtor sem tag de inje��o, devemos ignora-lo
	public Coracao(String mensagemDesnecessaria) {
		super();
		System.out.println("O coração não precisa de " + mensagemDesnecessaria);
	}
	
	@AutoDollyInjection
	public Coracao() {
		super();
	}

	
	
	
}
