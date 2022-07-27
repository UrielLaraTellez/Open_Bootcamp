public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente() ;
        cliente.edad = 23 ;
        cliente.nombre = "Ricardo" ;
        cliente.telefono = 452435426 ;
        cliente.credito = 1000 ;

        System.out.println("Nombre cliente: " + cliente.nombre + "\nEdad: " + cliente.edad + 
        "\nTelefono: " + cliente.telefono + "\nCredito: " + cliente.credito);

        Trabajador trabajador = new Trabajador() ;
        trabajador.edad = 25 ;
        trabajador.nombre = "Adrian" ;
        trabajador.telefono = 45245326 ;
        trabajador.salario = 500 ;

        System.out.println("Nombre trabajador: " + trabajador.nombre + "\nEdad: " + trabajador.edad + 
        "\nTelefono: " + trabajador.telefono + "\nSalario: " + trabajador.salario);
    }
}

class Persona {
    int edad ;
    String nombre ;
    int telefono ;
}

class Cliente extends Persona{
    int credito ;
}

class Trabajador extends Persona {
    int salario ;
}
