package com.biblioteczka.S.BLibrary.Config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api()
    {
        return GroupedOpenApi.builder()
                .group("AddBookController")
                .packagesToScan("com.biblioteczka.S.BLibrary")
                .build();
    }
}
