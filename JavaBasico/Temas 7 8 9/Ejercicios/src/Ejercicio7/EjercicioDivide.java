package Ejercicio7;

import java.util.Scanner;

public class EjercicioDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce dos numeros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(divide (a,b));
        }catch (ArithmeticException e){
            System.out.println( "Esto no puede hacerse");
        }finally {
            System.out.println( "Demo de código");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
