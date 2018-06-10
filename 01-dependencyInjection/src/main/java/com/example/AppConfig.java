package com.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    @Scope("singleton")
    @Profile("production")
    UserRepository userRepository() {
        return new UserRepositoryImpl("default profile");
    }

    @Bean
    @Scope("singleton")
    @Profile("development")
    UserRepository mockUserRepository() {
        return new UserRepositoryImpl("development profile");
    }

    @Bean
    @Scope("prototype")
    PasswordEncoder passwordEncoder() {
        return new PasswordEncoderImpl();
    }

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    UserFactory threadUnSafeUserFactory() {
        return new ThreadUnSafeUserFactory();
    }
}
