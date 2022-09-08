package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioLinkedList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hugo");
        lista.add("Ruben");
        lista.add("Luis");
        lista.add("Ivan");

        LinkedList<String> listalink =new LinkedList<>();

        for (int i =0; i<lista.size();i++){
            listalink.add(i,lista.get(i));
        }

        System.out.println("Elementos del array: ");
        for (String elementos:lista){
            System.out.println(elementos+" ");
        }

        System.out.println("Elementos LinkedList: ");
        for (String elementos : listalink){
            System.out.println(elementos+ " ");
        }
    }
}
