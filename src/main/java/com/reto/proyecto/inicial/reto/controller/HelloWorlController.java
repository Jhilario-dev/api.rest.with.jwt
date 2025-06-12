package com.reto.proyecto.inicial.reto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {

    @GetMapping("/hello")
    public String helloWorld() {
         return "Hello World";
    }
}
