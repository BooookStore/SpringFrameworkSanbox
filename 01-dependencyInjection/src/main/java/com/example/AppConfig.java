package com.example;

import com.development.config.AppDevelopmentConfig;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
@Import(AppDevelopmentConfig.class)
public class AppConfig {

    @Bean
    @Scope("singleton")
    @Profile("production")
    UserRepository userRepository() {
        return new UserRepositoryImpl("default profile");
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
