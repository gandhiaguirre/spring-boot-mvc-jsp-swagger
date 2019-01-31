package com.gandhiaguirre.springboot.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * Como es un proyecto war para que se pueda desplegar en un servidor (Tomcat).
	 * Si utilizamos un servidor embebido y utilizamos jar en lugar de war, no es
	 * necesario esta clase.
	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebJspApplication.class);
	}

}
