
public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(21);
        persona1.setNombre("Manuel");
        persona1.setTelefono("4421048930");

        System.out.println("El nombre es: " + persona1.getNombre()); 
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Telefono: " + persona1.getTelefono());

    }
}

class Persona {
    private int edad ;
    private String nombre ;
    private String telefono ;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    public int getEdad () {
        return this.edad;
    }

    public String getNombre () {
        return this.nombre;
    }
    public String getTelefono () {
        return this.telefono;
    }

}