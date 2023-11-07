package com.example.login.user;

public record UserRequestDTO(Long id, String name, String password) {
    public UserRequestDTO(User user) {
        this(user.getId(), user.getName(), user.getPassword());
    }
}