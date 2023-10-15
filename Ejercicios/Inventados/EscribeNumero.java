package ParaPracticar;

import java.util.Scanner;

public class EscribeNumero {

    public static void main(String[] args) {
        double num;
        boolean esNumero = false;
        Scanner scanner = new Scanner(System.in);
        
        //La clave es que !esNumero significa "mientras no sea un número válido".
        while (!esNumero) {
            System.out.print("Escribe un número: ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt(); //Lee el siguiente valor entero (número entero) ingresado por el usuario a través de la consola y lo devuelve como resultado.
                esNumero = true;
                System.out.print("Has escrito el número entero " + (int)num);
                
            } else if (scanner.hasNextDouble()) {
                num = scanner.nextDouble(); //Lee el siguiente valor (número decimal) ingresado por el usuario a través de la consola y lo devuelve como resultado.
                esNumero = true;
                System.out.print("Has escrito el número decimal " + num);
                
            } else {
                System.out.println("Estás escribiendo letras o un formato no válido. Debes ingresar números.");
                scanner.next();
            
            }
        }

        scanner.close();
    }
}

		
