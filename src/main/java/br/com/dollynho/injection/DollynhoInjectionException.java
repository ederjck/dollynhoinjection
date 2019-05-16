package br.com.dollynho.injection;

/**
 * No nosso projeto muito melhor que CDI, Spring e concorrentes, 
 * todas nossas exceções são tratadas como uma DollynhoInjectionException.
 * Porque é muito mais legal ter uma exceção pra tudo, não é porque estamos simplificando.
 * 
 */
public class DollynhoInjectionException extends RuntimeException {

	private static final long serialVersionUID = 2550244331400341533L;

	public DollynhoInjectionException() {
		super();
	}
	
	DollynhoInjectionException(Exception e){
		super(e);
	}
	
}
