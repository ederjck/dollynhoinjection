package br.com.dollynho.injection;

/**
 * No nosso projeto muito melhor que CDI, Spring e concorrentes, 
 * todas nossas exce��es s�o tratadas como uma DollynhoInjectionException.
 * Porque � muito mais legal ter uma exce��o s� pra tudo, n�o porque estamos simplificando.
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
