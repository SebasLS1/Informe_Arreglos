import java.util.Scanner; // Importa la clase Scanner para leer datos desde la consola

public class arregloBidimensional {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Crea un objeto Scanner para leer entrada del usuario
        int opcion = 1; // Variable para controlar el bucle principal
        int controlOperacione; // Variable para elegir la operación a realizar
        int[][] matriz1, matriz2, matrizSuma, matrizMultiplicación; // Declaración de matrices

        do {
            // Solicitar al usuario las dimensiones de la primera matriz y leer los elementos
            System.out.println("Ingrese la Dimensión de la primera matriz");
            System.out.println("Fila: ");
            int fila1 = leer.nextInt();
            System.out.println("Columna: ");
            int columna1 = leer.nextInt();
            matriz1 = new int[fila1][columna1];
            leerElementosDeLaMatriz(matriz1, fila1, columna1);

            // Solicitar al usuario las dimensiones de la segunda matriz y leer los elementos
            System.out.println("Ingrese la Dimensión de la segunda matriz");
            System.out.println("Fila: ");
            int fila2 = leer.nextInt();
            System.out.println("Columna: ");
            int columna2 = leer.nextInt();
            matriz2 = new int[fila2][columna2];
            leerElementosDeLaMatriz(matriz2, fila2, columna2);

            // Solicitar al usuario la operación a realizar (suma o multiplicación)
            System.out.println("Ingrese el número de acuerdo a las opciones para realizar con las matrices");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar:");
            System.out.println("opción: ");
            controlOperacione = leer.nextInt();

            switch (controlOperacione) {
                case 1:
                    // Verificar si las dimensiones son iguales para realizar la suma
                    if ((fila1 == fila2) && (columna1 == columna2)) {
                        matrizSuma = new int[fila1][columna1];
                        for (int i = 0; i < fila1; i++) {
                            for (int j = 0; j < columna1; j++) {
                                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]; // Suma los elementos correspondientes
                            }
                        }
                        imprimirMatrizResultante(matrizSuma); // Imprime la matriz resultante
                    } else {
                        System.out.println("Las dimensiones no concuerdan para esta operación");
                    }
                    break;
                case 2:
                    // Verificar si las dimensiones son compatibles para realizar la multiplicación
                    if (columna1 == fila2) {
                        matrizMultiplicación = new int[fila1][columna2];
                        for (int i = 0; i < fila1; i++) {
                            for (int j = 0; j < columna2; j++) {
                                for (int k = 0; k < columna1; k++) {
                                    matrizMultiplicación[i][j] += matriz1[i][k] * matriz2[k][j]; // Multiplica y acumula los productos
                                }
                            }
                        }
                        imprimirMatrizResultante(matrizMultiplicación); // Imprime la matriz resultante
                    }
                    break;
                default:
                    System.out.println("Porque no ingresas las respuestas correctas :3, ahora repite todo.");
            }

            // Solicitar al usuario si desea salir o realizar otra operación
            System.out.println("Para salir ingrese 0, si desea volver a usar el sistema ingrese otro entero: ");
            opcion = leer.nextInt();
        } while (opcion != 0); // Repetir el bucle mientras la opción sea diferente de 0
    }

    // Método para leer los elementos de una matriz
    private static void leerElementosDeLaMatriz(int[][] matriz, int fila, int columna) {
        Scanner aux = new Scanner(System.in);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Ingrese el valor de la fila " + (1 + i) + " y la columna " + (1 + j) + ".");
                matriz[i][j] = aux.nextInt(); // Lee el valor ingresado por el usuario y lo asigna a la matriz
            }
        }
        imprimirMatrizResultante(matriz); // Imprime la matriz ingresada
    }

    // Método para imprimir una matriz
    private static void imprimirMatrizResultante(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " "); // Imprime cada elemento de la fila
            }
            System.out.println(); // Imprime un salto de línea después de cada fila
        }
    }
}
