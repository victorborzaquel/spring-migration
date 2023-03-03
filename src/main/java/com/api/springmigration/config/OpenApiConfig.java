package com.api.restaws.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST API para o Gerenciamento de Pessoas")
                        .version("v1")
                        .description("API desenvolvida para demonstrar os conhecimentos de migrations.")
                        .contact(new Contact()
                                .name("Victor Borzaquel")
                                .url("https://www.linkedin.com/in/victorborzaquel/")
                        )
                );
    }
}
