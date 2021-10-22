package com.tutorial.springboottutorial.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        
        return args -> {
            Student andy = new Student(
                    "Vally",
                    "vally@test.com",
                    LocalDate.of(2002, Month.DECEMBER, 9)
            );
            Student mariana = new Student(
                    "Mariana",
                    "mariana@test.com",
                    LocalDate.of(2006, Month.SEPTEMBER, 1)
            );

            repository.saveAll(
                List.of(andy, mariana)
            );
        };
    }

}
