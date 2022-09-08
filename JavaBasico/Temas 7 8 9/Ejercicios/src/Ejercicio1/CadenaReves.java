package Ejercicio1;

import java.util.Scanner;

public class CadenaReves {

    public static void main(String[] args) {
        System.out.println("----Cadena reves----");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce texto");
        String texto = sc.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();
        System.out.println("El texto al reves es: "+ texto);
    }
}
