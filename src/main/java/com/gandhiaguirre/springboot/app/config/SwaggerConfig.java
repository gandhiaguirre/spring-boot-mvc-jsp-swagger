package com.gandhiaguirre.springboot.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.gandhiaguirre.springboot.app.controllers.IndexController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@ComponentScan(basePackageClasses = IndexController.class)
public class SwaggerConfig {

	@Value("${springfox.documentation.swagger.v1.version}")
	private String API_VERSION;
	@Value("${springfox.documentation.swagger.v1.title}")
	private String TITLE;
	@Value("${springfox.documentation.swagger.v1.description}")
	private String DESCRIPTION;

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().version(API_VERSION).title(TITLE).description(DESCRIPTION).build();
	}

	@Bean
	public Docket indexControllerApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.gandhiaguirre.springboot.app.controllers"))
				.paths(PathSelectors.any()).build();
	}

}
