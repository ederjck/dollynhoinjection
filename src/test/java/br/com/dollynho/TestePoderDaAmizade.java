package br.com.dollynho;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.dollynho.business.Coracao;
import br.com.dollynho.business.CoracaoSemAnnotation;
import br.com.dollynho.business.CoracaoSemConstrutor;
import br.com.dollynho.business.MensagensDaAmizade;
import br.com.dollynho.business.SuperNegocios;
import br.com.dollynho.injection.DollynhoInjectionException;
import br.com.dollynho.injection.Instanciador;
import br.com.dollynho.injection.ObjectStorage;

public class TestePoderDaAmizade {

	private static Instanciador instanciador;
	
	@BeforeClass
	public static void setup() {
		instanciador = new Instanciador();
	}
	
	@Test(expected = DollynhoInjectionException.class)
	public void coracaoSemConstrutor() {
		instanciador.instanciar(CoracaoSemConstrutor.class);
	}
	
	@Test(expected = DollynhoInjectionException.class)
	public void coracaoSemAnnotation() {
		instanciador.instanciar(CoracaoSemAnnotation.class);
	}
	
	@Test
	public void coracao() {
		Object c = instanciador.instanciar(Coracao.class);
		assertEquals(c.getClass(), Coracao.class);
	}
	
	@Test
	public void mensagensDaAmizade() {
		MensagensDaAmizade mensagemAmizade = instanciador.instanciar(MensagensDaAmizade.class);
		assertEquals("Erro ao encontrar a mensagem da amizade.", mensagemAmizade.getMensagem(), ObjectStorage.getInstance().getObject(String.class));
		assertEquals("Erro ao encontrar o valor da mensagem da amizade.", mensagemAmizade.getValor(), ObjectStorage.getInstance().getObject(Double.class));
	}
	
	@Test
	public void superNegocios() {
		SuperNegocios superNegocios = instanciador.instanciar(SuperNegocios.class);
		assertEquals("Erro ao encontrar o id dos super neg�cios.", superNegocios.getId(), ObjectStorage.getInstance().getObject(Integer.class));
		assertEquals("Erro ao encontrar a quantidade de super neg�cios.", superNegocios.getQuantidade(), ObjectStorage.getInstance().getObject(Long.class));
	}
	
}
