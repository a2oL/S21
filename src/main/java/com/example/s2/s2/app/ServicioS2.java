package com.example.s2.s2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.s2.s2.controller","com.example.s2.s2.repositories","com.example.s2.s2.models","com.example.s2.s2.interfaces","com.example.s2.s2.app","com.example.s2.s2.mapers"})
public class ServicioS2 {

    public static void main(final String[] args) {
        SpringApplication.run(ServicioS2.class, args);
    }

}
