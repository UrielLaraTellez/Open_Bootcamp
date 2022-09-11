package com.example.Ejercicios_Sesiones456.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String saludo(){
        return "Hola mundo, como estan?";
    }
}
