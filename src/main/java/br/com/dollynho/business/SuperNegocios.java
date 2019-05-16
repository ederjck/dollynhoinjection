package br.com.dollynho.business;

import br.com.dollynho.injection.AutoDollyInjection;

public class SuperNegocios {

	private final Integer id;
	private final Long quantidade;
	
	@AutoDollyInjection
	public SuperNegocios(Integer id, Long quantidade) {
		super();
		this.id = id;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public Long getQuantidade() {
		return quantidade;
	}
	
	
	
}
