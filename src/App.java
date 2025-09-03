import java.util.Scanner; // Importamos la clase Scanner para leer datos desde teclado

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Se crea el objeto Scanner para capturar datos del usuario (entrada estándar)

        // Se pide al usuario cuántos números va a ingresar
        System.out.println("¿Cuántos números deseas ingresar para validar si son primos?");
        int cantidadNumeros = scanner.nextInt(); // Guardamos la cantidad en una variable entera

        // Declaración de arreglos para almacenar números, primos y no primos
        int[] numeros = new int[cantidadNumeros];   // Guarda todos los números ingresados
        int[] primos = new int[cantidadNumeros];    // Guarda únicamente los primos
        int[] noPrimos = new int[cantidadNumeros];  // Guarda únicamente los no primos

        // Contadores para controlar la cantidad real de primos y no primos almacenados
        int contadorPrimos = 0, contadorNoPrimos = 0;

        // ---- PARADIGMA IMPERATIVO: instrucción secuencial de llenado ----
        for (int i = 0; i < cantidadNumeros; i++) { // Bucle para ingresar cada número
            System.out.print("Ingrese el número " + (i + 1) + ": "); // Pide el número en orden
            numeros[i] = scanner.nextInt(); // Se almacena en el arreglo "numeros"
        }

        // ---- PARADIGMA IMPERATIVO: procesamiento paso a paso ----
        for (int i = 0; i < cantidadNumeros; i++) { // Recorremos todos los números ingresados
            int numero = numeros[i]; // Tomamos el número en la posición i
            boolean esPrimo = true;  // Variable de control para verificar si es primo

            // Los números <= 1 no son primos
            if (numero <= 1) {
                esPrimo = false;
            } else {
                // Verificamos divisores desde 2 hasta la raíz cuadrada
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) { // Si es divisible entre otro número
                        esPrimo = false;   // Entonces no es primo
                        break;             // Rompe el ciclo porque ya no es necesario seguir
                    }
                }
            }

            // ---- PARADIGMA IMPERATIVO: decisión mediante condicional ----
            if (esPrimo) { // Si el número es primo
                primos[contadorPrimos] = numero; // Lo guardamos en el arreglo de primos
                contadorPrimos++;                // Incrementamos el contador de primos
            } else { // Si no es primo
                noPrimos[contadorNoPrimos] = numero; // Lo guardamos en el arreglo de no primos
                contadorNoPrimos++;                  // Incrementamos el contador de no primos
            }
        }

        // ---- PARADIGMA IMPERATIVO: salida ordenada en consola ----
        System.out.print("Primos:     "); // Mensaje para la lista de primos
        for (int i = 0; i < contadorPrimos; i++) { // Se recorre el arreglo de primos
            System.out.print(primos[i] + " "); // Se imprimen los números primos encontrados
        }

        System.out.print("\nNo primos:  "); // Mensaje para la lista de no primos
        for (int i = 0; i < contadorNoPrimos; i++) { // Se recorre el arreglo de no primos
            System.out.print(noPrimos[i] + " "); // Se imprimen los números no primos encontrados
        }
    }
}
