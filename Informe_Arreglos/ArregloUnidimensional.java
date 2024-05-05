import java.util.Scanner; // Clase para leer lo ingresado por el usuario en consola

public class ArregloUnidimensional {

    public static void main(String[] args) {

        //1. Declaración de variables
        int n; // Representa el valor del tamaño del arreglo unidimensional
        int[] arreglo; // Arreglo unidimensional de tipo entero
        Scanner sc = new Scanner(System.in); // Objeto llamado sc, declarado y creado para leer lo que ingrese el usuario

        //2. Creación del arreglo
        System.out.println("Ingrese el tamaño del arreglo");
        n = Integer.parseInt(sc.nextLine()); //Lo que ingrese el usuario se guardará en sc, luego se transformará en entero y se guardará en n
        arreglo = new int[n]; // n define ahora el tamaño del arreglo unidimensional


        //3. Operaciones
        System.out.println("a) Lectura: "); //Mensaje para indicar el tipo de operación básica
        //Imprimir o leer los datos del arreglo unidimensional a través de una iteración
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }


        System.out.println("\n\t"); //Permite saltos de líneas adecuados para tener segmentado el código de mejor manera cuando se muestre en consola
        System.out.println("b) Asignación:");
        // Asignar al arreglo unidimensional el número 1 e imprimir los datos a través de un bucle
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 1;
            System.out.print("[" + arreglo[i] + "] ");
        }

        System.out.println("\n\t");
        System.out.println("c) Escritura");
        // Se llena e imprime el arreglo unidimensional con datos escritos por el usuario usando un ciclo for
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Escriba un dato para la posición: " + i);
            arreglo[i] = Integer.parseInt(sc.nextLine());
        }
        imprimirMatriz(arreglo); //Se lleva la lectura del arreglo a un método para no repetir código y mostrar los cambios hechos en cada operación


        System.out.println("\n\t");
        System.out.println("d) Actualización");
        //Declaración de nuevas variables
        int datoAActualizar; // Entero que permite al usuario indicar qué dato quiere actualizar en el arreglo unidimensional
        boolean datoActualizado; // Booleano para determinar si el dato fue actualizado o no

        //Inicialización
        System.out.println("Ingrese el dato que quiere actualizar");
        datoAActualizar = Integer.parseInt(sc.nextLine());
        datoActualizado = false; //Se establece inicialmente como falso el booleano porque todavía no se sabe si existe el dato a actualizar

        // Se recorre el arreglo unidimensional con un bucle, y se usa un condicional para encontrar un dato del arreglo que sea igual al dato a actualizar
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == datoAActualizar) {
                //Si se cumple la condición, se pide al usuario, en la posición del dato a actualizar, que ingrese el nuevo dato
                System.out.println("Ingrese el nuevo dato");
                arreglo[i] = Integer.parseInt(sc.nextLine());
                datoActualizado = true; //Se establece como true al haber encontrado y reescrito el dato a actualizar
            }
        }

        //Finalmente, se usa un condicional en la variable booleana para mostrar un mensaje sobre si se pudo o no actualizar el dato deseado
        if (datoActualizado) {
            System.out.println("El dato ha sido actualizado");
        } else {
            System.out.println("El dato a actualizar no se ha encontrado");
        }
        imprimirMatriz(arreglo); //Se imprime el arreglo para observar visualmente la actualización del dato


        System.out.println("\n\t");
        System.out.println("e) Eliminación");
        //Declaración de nuevas variables
        int datoAEliminar; // Entero que permite al usuario indicar qué dato quiere eliminar
        boolean datoEliminado; // Boolean para determinar si el dato fue eliminado o no

        //Inicialización
        System.out.println("Ingrese el dato que quiere eliminar");
        datoAEliminar = Integer.parseInt(sc.nextLine());
        datoEliminado = false; //Se establece inicialmente como falso el booleano porque todavía no se sabe si existe el dato a eliminar

        // Se itera en el arreglo y con un condicional, se determina si un dato del arreglo es igual al dato a eliminar
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == datoAEliminar) {
                //Si se cumple la condición, se asigna 0 en la posición del dato a eliminar para indicar que fue eliminado
                arreglo[i] = 0;
                datoEliminado = true; //Se establece como true al haber encontrado y puesto 0 el dato a eliminar
            }
        }

        //Finalmente, se muestra un mensaje sobre si se eliminó o no el dato a eliminar a través de un condicional con la variable booleana
        if (datoEliminado) {
            System.out.println("El dato ha sido eliminado");
        } else {
            System.out.println("El dato a eliminar no se ha encontrado");
        }
        imprimirMatriz(arreglo); //Se imprime el arreglo para mostrar visualmente la eliminación del dato

    }

    private static void imprimirMatriz(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print("[" + i + "] ");
        }
    }

}
