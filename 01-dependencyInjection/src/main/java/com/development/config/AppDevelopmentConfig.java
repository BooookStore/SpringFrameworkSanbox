package com.development.config;

import com.example.UserRepository;
import com.example.UserRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

@Configuration
@Profile("development")
public class AppDevelopmentConfig {

    @Bean
    @Scope("singleton")
    UserRepository mockUserRepository() {
        return new UserRepositoryImpl("development profile");
    }

}
