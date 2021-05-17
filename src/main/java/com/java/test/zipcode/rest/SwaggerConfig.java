package com.java.test.zipcode.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*************************************************************************************/
/* Date: 16/05/2021
 * Author: Floricelda Cabrera Santos
 * Descripción: Clase que expone la documentación del servicio*/
/************************************************************************************/

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	 
	 /**
	 * @return Docket
	 */
	@Bean
		public Docket apiDocket() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.java.test.zipcode.rest"))
					.paths(PathSelectors.any())
					.build();
		}
}
