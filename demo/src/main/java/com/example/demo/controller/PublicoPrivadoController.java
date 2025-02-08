package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicoPrivadoController {

    @GetMapping("/publico")
    public String publico() {
        return "Este es un mensaje público, accesible sin autenticación.";
    }

    @GetMapping("/privado")
    public String privado() {
        return "Este es un mensaje privado, accesible solo para usuarios autenticados.";
    }
}
