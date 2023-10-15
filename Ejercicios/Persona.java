package UF_04_POO;

// Propuesta de ejercicio 4 - VT03

// Crea una clase "Persona" con atributos "nombre", "apellido1", "apellido2", "sexo", "edad" y "direccion"
// y dos métodos "mostrarDatos()", "mayorEdad".

public class Persona {
    // Definimos los atributos.
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String sexo;
    private int edad;
    private String direccion;

    // Constructor
    public Persona(String nombre, String apellido1, String apellido2, String sexo, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Método para mostrar los datos de la persona.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Segundo apellido: " + apellido2);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        
        if(mayorEdad()) {
        	System.out.println("Es mayor de edad.");
        }else {
        	System.out.println("No es mayor de edad");
        }
        
        System.out.println(); //Separador entre personas.
    }

    // Método para verificar si la persona es mayor de edad.
    public boolean mayorEdad() {
        return edad >= 18; // Cambiado ">" a ">=" para incluir a las personas de 18 años.
    }

    public static void main(String[] args) {
        // Instanciamos una clase.
        Persona persona1 = new Persona("Jose Antonio", "Montero", "Fernández", "Masculino", 37, "Calle Treinta y Tres, Los Arroyos");
        Persona persona2 = new Persona("Brenda", "González", "Hernández", "Femenino", 33, "Calle Treinta y Tres, Los Arroyos");
        Persona persona3 = new Persona("Luis", "Martínez", "Sánchez", "Masculino", 30, "Calle ABC");
        Persona persona4 = new Persona("Ana", "Fernández", "Gómez", "Femenino", 17, "Calle 456");
        
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();
        persona4.mostrarDatos();
        
    }
}

