# Framework de Injeção da amizade

Durante a nossa implementação de negócio, percebemos que frameworks como Spring não nos atendiam, pois não irradiavam amizade suficiente.
Decidimos então criar o nosso próprio framework de injeção, baseado no poder do Dollynho. 
Parte da implementação foi feita no pacote br.com.dollynho.injection.

Também incluimos alguns testes em TestePoderDaAmizade.java.

Resta a você, nosso brilhante e fofo arquiteto, munido do poder da amizade, implementar o nosso Intanciador de classes!

A idéia é instanciar uma classe passada como parametro no método instanciar do Instanciador.java, 
recuperar os objetos que vamos injetar de ObjectStorage e passa-los como parâmetros no construtor. 

Um modo de resolver seria:
- Encontrar o construtor marcado com nossa annotation Super Original @AutoDollyInjection
- Se ele não encontrar um construtor com essa anotation, deve jogar uma DollynhoInjectionException. 
- Alias, como DollynhoInjectionException é uma exceção muito mais legal, vamos jogar qualquer exceção que tenhamos que tratar como uma DollynhoInjectionException!
    Incluindo  InstantiationException, IllegalAccessException, IllegalArgumentException e InvocationTargetException!
- Achado o construtor, vamos buscar os objetos que queremos injetar em ObjectStorage, nossa avançadissima classe de armazenamento de objetos.
- Depois de encontrados os valores, vamos instanciar o objeto através do construtor e devolver o nosso objeto recém criado!

Dá pra resolver mexendo apenas no Instanciador.java, mas como arquiteto super sayajin nível 42 modo sábio, fique a vontade para modificar outras classes do pacote.

Reflection funciona utilizando um objeto do tipo java.lang.Class.
Ele possui acesso a toda a estrutura de uma determinada classe. 
Dicas do Dollynho:

- Podemos usar classe.getConstructors() para obter uma lista dos construtures a que temos acesso.

- A classe Constructor em si possui acesso as annotations através dos métodos getAnnotation, getAnnotationsByType e getAnnotations, 
onde podemos encontrar qual deles (e se possuem) possui a anotation procurada.

- Feito isso, podemos obter a lista dos parametros do construtor desejado e recuperar os objetos do nosso ObjectStorage pela classe informada.

- Depois disso, basta chamar newInstance passando um array com todos os parametros recuperados. Pronto, temos nosso instanciador com injeção!

- Na hora do return, use (T) para fazer o cast do objeto gerado, caso tenha problema nesse passo.

- Use os testes para validar a sua implementação.