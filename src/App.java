import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números deseas ingresar para validar si son primos?");
        int cantidadNumeros = scanner.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int[] primos = new int[cantidadNumeros];
        int[] noPrimos = new int[cantidadNumeros];
        int contadorPrimos = 0, contadorNoPrimos = 0;

        // Entrada de números
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Validación de primos
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = numeros[i];
            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numero;
                contadorNoPrimos++;
            }
        }

        // Resumen final usando "matriz de dos filas"
        System.out.print("Primos:     ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(primos[i] + " ");
        }

        System.out.print("\nNo primos:  ");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
    }
}
