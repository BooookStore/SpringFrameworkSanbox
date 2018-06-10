package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private UserFactory userFactory;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserFactory userFactory) {
        this.userRepository = userRepository;
        this.userFactory = userFactory;
    }

    @SuppressWarnings("WeakerAccess")
    @Lookup
    PasswordEncoder passwordEncoder() {
        return null;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userRepository=" + userRepository +
                ", passwordEncoder=" + passwordEncoder() +
                ", userFactory =" + userFactory +
                '}';
    }
}
