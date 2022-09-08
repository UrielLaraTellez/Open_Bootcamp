package Ejercicio8;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EjercicioInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fichero de origen: ");
        String fileIn = sc.nextLine();
        System.out.println("Introduce fichero de destino: ");
        String fileOut = sc.nextLine();

        copiar(fileIn,fileOut);


    }

    public static void copiar(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            in.close();
        }catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
