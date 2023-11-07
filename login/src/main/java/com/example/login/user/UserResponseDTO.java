package com.example.login.user;

public record UserResponseDTO(String name, String password) {
    public UserResponseDTO(User user) {
        this(user.getName(), user.getPassword());
    }
}
