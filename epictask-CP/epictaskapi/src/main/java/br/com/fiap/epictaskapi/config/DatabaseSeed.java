package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Configuration
@Profile("dev")
public class DatabaseSeed implements CommandLineRunner {


    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        userRepository.saveAll(List.of(
            new User()
                .name("admin")
                .email("admin@fiap.com.br")
                .password(passwordEncoder.encode("administrador")),
            new User()
                .name("Carlos")
                .email("carlos@fiap.com.br")
                .password(passwordEncoder.encode("456")),
            new User()
                .name("Roberto")
                .email("roberto@fiap.com.br")
                .password(passwordEncoder.encode("789"))
        ));

    }
    
}
