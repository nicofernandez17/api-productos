package com.challenge.mercadolibre.meli_challenge.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Mercado Libre API")
                        .version("1.0")
                        .description("API para gestión de productos de Mercado Libre")
                        .contact(new Contact()
                                .name("Nicolas Fernandez")
                                .email("nicofsc@gmail.com")
                        )
                );
    }

    //Redirect to Swagger UI
    @Controller
    static class SwaggerRedirectController {
        @GetMapping("/documentation")
        public String redirectToSwagger() {
            return "redirect:/swagger-ui/index.html";
        }

        @GetMapping("/swagger")
        public String redirectToSwaggerAlt() {
            return "redirect:/swagger-ui/index.html";
        }
    }
}