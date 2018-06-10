package com.example;

public class UserRepositoryImpl implements UserRepository {

    private String message;

    public UserRepositoryImpl(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserRepositoryImpl{" +
                "message='" + message + '\'' +
                '}';
    }
}
