package br.com.dollynho.business;

import br.com.dollynho.injection.AutoDollyInjection;

public class MensagensDaAmizade {
	
	private final String mensagem;
	private final Double valor;
	
	@AutoDollyInjection
	public MensagensDaAmizade(String mensagem, Double valor) {
		super();
		this.mensagem = mensagem;
		this.valor = valor;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Double getValor() {
		return valor;
	}
	
	
	
}
