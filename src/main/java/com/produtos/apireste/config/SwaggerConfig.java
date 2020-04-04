package com.produtos.apireste.config;

import java.util.ArrayList;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	public ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Produtos Api Rest",
				"Api Rest de Cadastro de Produtos",	
				"1.0",
				"Terms of Service",
				new Contact("Andre Siqueira", "andre3s.sqr@gmail.com", null),
				"Apache License Version 2.0",
				"http://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
		);
		return apiInfo;
	}
}
