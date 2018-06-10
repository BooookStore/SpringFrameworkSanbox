package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(UserService.class));

        System.out.println("Singleton : differ bean" +
                "\n\t" + context.getBean(PasswordEncoder.class) +
                "\n\t" + context.getBean(PasswordEncoder.class));

        System.out.println("Prototype : same bean" +
                "\n\t" + context.getBean(UserRepository.class) +
                "\n\t" + context.getBean(UserRepository.class));

        System.out.println("Lookup method : differ bean in UserServiceImpl#prototype" +
                "\n\t" + context.getBean(UserService.class) +
                "\n\t" + context.getBean(UserService.class));

        UserService bean = context.getBean(UserService.class);
        System.out.println(bean);
        System.out.println(bean);
    }
}
