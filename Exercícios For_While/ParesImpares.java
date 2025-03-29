import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int contador = 0;

        System.out.println("Digite 10 números inteiros:");

        while (contador < 10) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}