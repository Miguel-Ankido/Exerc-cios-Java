import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0.0;
        int contador = 0;

        System.out.println("Digite a idade e a altura de 10 pessoas:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Altura da pessoa " + i + " (em metros): ");
            double altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double mediaAlturas = somaAlturas / contador;
            System.out.printf("Média das alturas das pessoas com mais de 50 anos: %.2f metros\n", mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }

        scanner.close();
    }
}