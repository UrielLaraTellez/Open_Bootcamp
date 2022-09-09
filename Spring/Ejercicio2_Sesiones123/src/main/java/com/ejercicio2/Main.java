package com.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificacion = (NotificationService) context.getBean("notificationService");

        UserService usuario1 = (UserService) context.getBean("userService");

        String mensaje = usuario1.notificacion.imprimirSaludo();

        System.out.println(mensaje);
    }
}
