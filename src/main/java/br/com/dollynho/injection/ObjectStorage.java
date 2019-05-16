package br.com.dollynho.injection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * No nosso negócio totalmente superior ao dos concorrentes, só precisamos injetar
 * objetos simples de um conjunto limitado, porque nosso negócio é muito mais legal. 
 *
 */
public class ObjectStorage {
	
	private static final List<Object> objetos = Arrays.asList(new Object[] {
		new Integer(13), 
		new Long(1313131313), 
		new String("Dollynho é vida, coca é morte!"),
		new Double(13.13) 
	});
	
	public static ObjectStorage getInstance() {
		return new ObjectStorage();
	}
	
	private ObjectStorage() {
		
	}
	
	public Object getObject(@SuppressWarnings("rawtypes") Class classe) {
		Optional<Object> object = objetos.stream()
				  					     .filter(o -> o.getClass().isAssignableFrom(classe))
				  					     .findAny();  
		if(!object.isPresent()) {
			throw new DollynhoInjectionException();
		}
		
		return object.get();
	}
	
}
