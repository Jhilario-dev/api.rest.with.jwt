package com.reto.proyecto.inicial.reto.controller;

import com.reto.proyecto.inicial.reto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@RequiredArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping
    public String prueba() {
        return "funcionando";
    }

    @PostMapping("/createUser")
    public String CreateUser(@RequestBody UserController user) {
        return "hola mundo";
    }
}
