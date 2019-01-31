package com.gandhiaguirre.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Esta es la clase mas importante en SpringBoot, aquí es donde arranca la
 * aplicación
 * 
 * Envuelve lo siguiente:
 * 
 * \@Target(ElementType.TYPE) \@Retention(RetentionPolicy.RUNTIME) \@Documented
 * \@Inherited
 * \@SpringBootConfiguration
 * \@EnableAutoConfiguration
 * \@ComponentScan(excludeFilters = {
 * \@Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
 * \@Filter(type = FilterType.CUSTOM, classes =
 *              AutoConfigurationExcludeFilter.class) })
 */
@SpringBootApplication
public class SpringBootWebJspApplication {

	public static void main(String[] args) {

		// Se le pasa el class 
		SpringApplication.run(SpringBootWebJspApplication.class, args);
	}

}
