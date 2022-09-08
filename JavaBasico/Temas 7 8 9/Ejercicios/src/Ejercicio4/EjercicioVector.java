package Ejercicio4;
import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Vector con 5 elementos:"+vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector con elementos removidos: "+vector);
    }
}
