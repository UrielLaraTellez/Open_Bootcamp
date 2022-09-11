package com.example.Ejercicios_Sesiones456.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiDetails(){
        return new ApiInfo("API REST Laptops",
                "API REST de computadoras creada con ayuda de Spring Boot",
                "1.0",
                "https://www.google.com",
                new Contact("Uriel","https://www.google.com","urielglt@gmail.com"),
                "MIT",
                "https://www.google.com",
                Collections.emptyList());
    }

}
