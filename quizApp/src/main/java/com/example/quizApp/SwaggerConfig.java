package com.example.quizApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
//	to main api documentation write method
//	docket is use to generated api documentation 
	
	@Bean
	public Docket api() 
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
//				below you can select any it scan all the classes or you can mention basePacakage also
				.apis(RequestHandlerSelectors.basePackage("com.example.quizApp"))
				.paths(PathSelectors.any())
				.build().apiInfo(metaData());
	}
	
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Tech interface -Spring Boot Swagger Configuration")
				.description("Swagger configuration for application")
				.version("1.1.0")
				.license("Apache 2.0")
				.licenseUrl("hhtps://www.apache.org/license/LICENSE-2.0\"")
				.contact(new Contact("Amit","https://www.youtube.com/watch?v=Tx4Fh25KqaU","amitsharma7565@gmail.com"))
				.build();
	}
}
