package ProgramacionB;

import java.util.Scanner;

public class EstructurasControl2 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int num;
        boolean esValido = false; // Variable para controlar la validez del número ingresado

        while (!esValido) { // Bucle que se ejecuta hasta que el número ingresado sea válido
            System.out.print("Introduce un número entero positivo: ");

            // Verifica si la entrada es un número entero
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                // Verifica si el número es positivo
                if (num > 0) {
                    esValido = true; // Marca el número como válido y sale del bucle
                    System.out.println("Los primeros " + num + " números de la secuencia de Fibonacci son:");

                    // Calcula y muestra los primeros "num" números de la secuencia de Fibonacci
                    for (int i = 0; i < num; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                } else {
                    System.out.println("Por favor, ingresa un número entero positivo.");
                }
            } else {
                scanner.next(); // Limpia la entrada inválida
            }
        }

        scanner.close(); // Cerramos el objeto Scanner para liberar los recursos
    }

    // Método para calcular el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        
        // fibonacci(3) se calcula como fibonacci(2) + fibonacci(1), ya que n - 1 es 2 y n - 2 es 1.
    }
}

