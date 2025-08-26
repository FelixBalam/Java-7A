import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos Numeros deseas ingresar, para la validacion si son numeros primos");
        int Cantidadnumeros = scanner.nextInt();
        int[] numeros = new int[Cantidadnumeros];
        for (int i = 0; i < Cantidadnumeros; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < Cantidadnumeros; i++) {
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
                System.out.println("El numero " + numero + " es primo.");
            } else {
                System.out.println("El numero " + numero + " no es primo.");
            }
        }   

    }
}
