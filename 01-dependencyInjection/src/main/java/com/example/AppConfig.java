package com.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    @Scope("singleton")
    UserRepository userRepository() {
        return new UserRepositoryImpl();
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
