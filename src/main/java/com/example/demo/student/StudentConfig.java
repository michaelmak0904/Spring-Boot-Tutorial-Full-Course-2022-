package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Manet = new Student(
                    "Manet",
                    "Manet@goak.com",
                    LocalDate.of(2000, Month.APRIL,1)
            );

            Student Poop = new Student(
                    "Poop",
                    "Poop@goak.com",
                    LocalDate.of(2020, Month.APRIL,10)
            );

            studentRepository.saveAll(
                    List.of(Manet,Poop)
            );
        };
    }
}
