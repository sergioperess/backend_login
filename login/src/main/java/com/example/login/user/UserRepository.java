package com.example.login.user;

import org.springframework.data.jpa.repository.JpaRepository;

// Classe para pegar as coisas do Banco de Dados
public interface UserRepository extends JpaRepository<User, Long> {

}
