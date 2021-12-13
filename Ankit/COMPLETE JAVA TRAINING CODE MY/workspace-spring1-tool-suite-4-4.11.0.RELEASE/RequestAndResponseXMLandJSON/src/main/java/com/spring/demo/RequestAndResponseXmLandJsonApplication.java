package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RequestAndResponseXmLandJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestAndResponseXmLandJsonApplication.class, args);
	}

//	@Bean
//	public Docket swaggerConfiguration() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/api/*"))
//				.apis(RequestHandlerSelectors.basePackage("spring.demo"))
//				.build();
//	}
}
