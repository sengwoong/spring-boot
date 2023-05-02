package com.example.my.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwagerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info().title("TODO API").version("0.0.1").description("TODO API 명세서");
        return new OpenAPI().info(info);
    }

}
