package br.com.dollynho.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Totalmente diferente de @Autowired e @Injection. 
 * Definitivamente não é mesma coisa. 
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface AutoDollyInjection {

}
