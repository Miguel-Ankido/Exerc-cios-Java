import java.util.Scanner;

public class Dobrando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor *= 2;
        }

        System.out.println(); // Para pular uma linha após a sequência
        scanner.close();
    }
}