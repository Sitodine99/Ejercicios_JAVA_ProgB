package ProgramacionB;

public class TableroConsola {
    public static void main(String[] args) {
        // Imprime las letras de las columnas del tablero de ajedrez
        System.out.println("  A B C D E F G H");

        // Inicia un bucle que recorre las filas del tablero
        for (int fila = 0; fila < 8; fila++) {
            // Imprime el número de fila correspondiente (del 8 al 1)
            System.out.print((8 - fila) + " ");

            // Inicia un bucle que recorre las columnas del tablero
            for (int columna = 0; columna < 8; columna++) {
                // Verifica si la suma de fila y columna es par (casilla blanca)
                if ((fila + columna) % 2 == 0) {
                    // Imprime un espacio en blanco para representar la casilla blanca
                    System.out.print("  ");
                } else {
                    // Imprime el carácter Unicode ▓▓ para representar la casilla negra
                    System.out.print("\u2588\u2588");
                }
            }

            // Imprime nuevamente el número de fila correspondiente
            System.out.print(" " + (8 - fila));

            // Cambia de línea para pasar a la siguiente fila
            System.out.println();
        }

        // Imprime las letras de las columnas del tablero de ajedrez nuevamente
        System.out.println("  A B C D E F G H");
    }
}
