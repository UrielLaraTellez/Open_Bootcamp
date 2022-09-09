package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
    }

    public String imprimirSaludo(){
        return("Hola, como estas?");
    }
}
