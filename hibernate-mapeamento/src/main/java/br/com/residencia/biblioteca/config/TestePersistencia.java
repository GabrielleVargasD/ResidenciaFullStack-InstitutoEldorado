package br.com.residencia.biblioteca.config;

import br.com.residencia.biblioteca.model.Autor;
import br.com.residencia.biblioteca.repository.AutorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestePersistencia {

    @Bean
    CommandLineRunner testar(AutorRepository autorRepository) {
        return args -> {
            Autor autor = new Autor();
            autor.setNome("Machado de Assis");
            autorRepository.save(autor);
        };
    }
}
