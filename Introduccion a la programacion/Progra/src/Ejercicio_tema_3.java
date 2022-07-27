public class Ejercicio_tema_3 {
    public static void main(String[] args) {
        
        var resultado = suma ( 10, 30 , 15);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma (int a, int b , int c){
        return a+b+c;
    }
}

class Coche{
    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }
}
 