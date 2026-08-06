package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    private final LearnReactor learnReactor;
    private final LearnOperators learnOperators;
    private final LearnErrors learnErrors;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // learnReactor.learnReactor();

        // learnOperators.learnMaps();

        // learnOperators.learnAggs();

        learnErrors.learnErrorHandling();
    }
}