import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Se pide al usuario la cantidad de números que va a ingresar
        System.out.println("Cuantos Numeros deseas ingresar, para la validacion si son numeros primos");
        int Cantidadnumeros = scanner.nextInt();

        // Se crea un arreglo para almacenar los números
        int[] numeros = new int[Cantidadnumeros];

        // Ciclo para llenar el arreglo con los números ingresados por el usuario
        for (int i = 0; i < Cantidadnumeros; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = scanner.nextInt();
        }

        // Ciclo para validar cada número si es primo o no
        for (int i = 0; i < Cantidadnumeros; i++) {
            int numero = numeros[i];
            boolean esPrimo = true; // Variable de control

            // Los números menores o iguales a 1 no son primos
            if (numero <= 1) {
                esPrimo = false;
            } else {
                // Se verifica si el número tiene divisores
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) { 
                        // Si tiene un divisor distinto de 1 y él mismo → no es primo
                        esPrimo = false;
                        break; // Se rompe el ciclo porque ya no hace falta seguir probando
                    }
                }
            }

            // Resultado final para cada número
            if (esPrimo) {
                System.out.println("El numero " + numero + " es primo.");
            } else {
                System.out.println("El numero " + numero + " no es primo.");
            }
        }   
    }
}
