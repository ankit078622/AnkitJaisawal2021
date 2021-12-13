package com.spring.config;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
//@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

	  @Bean
	  public Docket swaggerConfiguration() {
	    // The Docker object to customize API documentation
	    return new Docket(DocumentationType.SWAGGER_2).select()
	        .apis(RequestHandlerSelectors.basePackage("com.spring")).build().apiInfo(apiDoc());
	  }

//	  private ApiInfo apiDoc() {
//	    // Return the Api Info
//	    return new ApiInfo("CJF Rest Template", "Sample API for CJF Rest Template", "1.0", "Open Usage",
//	        new springfox.documentation.service.Contact("Architecture Team", "http://localhost:8080/",
//	            "sanjay.saxena@Cevalogistics.com"),
//	        "Sample License", "http://localhost:8080/", Collections.emptyList());
//
//	  }
	  
	  private ApiInfo apiDoc() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Atividades API REST",
	                "API REST de cadastro de atividades.",
	                "1.0",
	                "Terms of Service",
	                new Contact("João VR", "www.una.br/",
	                        " "),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
	        );

	        return apiInfo;
	    }
}



