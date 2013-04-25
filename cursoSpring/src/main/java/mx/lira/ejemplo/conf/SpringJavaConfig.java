package mx.lira.ejemplo.conf;

import mx.lira.ejemplo.bl.ServicioEjemplo;
import mx.lira.ejemplo.bl.impl.ServicioEjemploImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfig {
@Bean
public ServicioEjemplo beanServicioEjemplo(){
	return new ServicioEjemploImpl();
}
}
