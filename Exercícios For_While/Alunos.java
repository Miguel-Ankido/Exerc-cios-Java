import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlunos = 5;
        int aluno = 1;

        while (aluno <= numeroAlunos) {
            System.out.println("Aluno " + aluno + ":");

            double nota1 = -1;
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            }

            double nota2 = -1;
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("Média do Aluno %d: %.2f\n", aluno, media);
            aluno++;
        }

        scanner.close();
    }
}