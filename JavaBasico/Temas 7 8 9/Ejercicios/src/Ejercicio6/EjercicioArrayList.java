package Ejercicio6;

import java.util.ArrayList;

public class EjercicioArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0 ; i<10;i++){
            lista.add(i+1);
        }

        lista.removeIf(n -> (n % 2 == 0));

        for (int elemento:lista) {
            System.out.println(elemento);
        }
    }
}
