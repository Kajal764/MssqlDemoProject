package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoMssqlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoMssqlApplication.class, args);
    }

    @Autowired
    private Demorepo demorepo;

    @Override
    public void run(String... args) throws Exception {
        List<first> data = demorepo.findAll();
        data.forEach(System.out::println);
    }
}
