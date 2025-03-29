import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pessoasSemObesidade = 0;
        int contador = 1; // Contador para controlar o número de pessoas

        System.out.println("Digite a altura e o peso de 10 pessoas:");

        while (contador <= 10) {
            System.out.print("Altura da pessoa " + contador + " (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Peso da pessoa " + contador + " (em kg): ");
            double peso = scanner.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                pessoasSemObesidade++;
            }

            System.out.printf("IMC da pessoa %d: %.2f\n", contador, imc);
            contador++; // Incrementa o contador para a próxima pessoa
        }

        System.out.println("Número de pessoas sem obesidade: " + pessoasSemObesidade);
        scanner.close();
    }
}