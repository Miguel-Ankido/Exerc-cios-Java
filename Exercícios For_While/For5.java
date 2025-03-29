import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaMedias = 0.0;

        System.out.println("Digite as duas notas de 6 alunos:");

        for (int i = 1; i <= 6; i++) {
            System.out.print("Nota 1 do aluno " + i + ": ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2 do aluno " + i + ": ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.printf("Média do aluno %d: %.2f\n", i, media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                totalReprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                totalExame++;
            } else {
                System.out.println("APROVADO");
                totalAprovados++;
            }
        }

        double mediaClasse = somaMedias / 6;
        System.out.println("\nResumo:");
        System.out.println("Total de alunos APROVADOS: " + totalAprovados);
        System.out.println("Total de alunos de EXAME: " + totalExame);
        System.out.println("Total de alunos REPROVADOS: " + totalReprovados);
        System.out.printf("Média da classe: %.2f\n", mediaClasse);

        scanner.close();
    }
}