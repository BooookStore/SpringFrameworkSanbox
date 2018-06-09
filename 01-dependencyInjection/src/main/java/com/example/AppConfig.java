package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new PasswordEncoderImpl();
    }

}
