public class App {
    public static void main(String[] args) {
        
        //if

        System.out.println(" \n Primer Punto \n");

        var numeroif = 10 ;

        if (numeroif > 0){
            System.out.println("Es positivo el numero");
        }
        else if (numeroif < 0){
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es 0");
        }

        //while

        System.out.println("Segundo Punto \n");


        int numeroWhile =0 ;

        while ( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++ ;
        }

        //doWhile

        System.out.println(" \n Tercer Punto \n");

        do{ 
        System.out.println(numeroWhile);
        numeroWhile++ ;
        } while (numeroWhile <1);

        //for

        System.out.println("\n Cuarto Punto \n");

        for (int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++ ){
            System.out.println(numeroFor);
        }

        //switch

        System.out.println("\n Quinto Punto \n");

        String estacion = "primavera" ;
        
        switch (estacion) {
            case ("primavera"):
                System.out.println("Es primavera \n");
                break;
            case ("verano"):
                System.out.println("Es verano \n");
                break;
            case ("otono"):
                System.out.println("Es otono \n");
                break;
            case ("invierno"):
                System.out.println("Es invierno \n");
                break;
            default:
                System.out.println("No es estacion \n");
                break;
        }


    }
}
