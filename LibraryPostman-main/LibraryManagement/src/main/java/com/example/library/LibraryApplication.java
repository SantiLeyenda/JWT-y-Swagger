package com.example.library;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

 
    @Bean
    public CommandLineRunner meterUsuario(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String usuario = "admin";
            String contra = "admin123";

            if (userRepository.encontrarPorUsuario(usuario).isEmpty()) {
                User user = new User();
                user.setUsername(usuario); 
                user.setPassword(passwordEncoder.encode(contra));

                userRepository.save(user);
                System.out.println("Se creo el usuario: " + usuario);
            } else {
                System.out.println("Ya existe el usuario");
            }
        };
    }
}
