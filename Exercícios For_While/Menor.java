import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int contador = 0;

        System.out.println("Digite dez números inteiros e positivos:");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número digitado é: " + menor);
        scanner.close();
    }
}