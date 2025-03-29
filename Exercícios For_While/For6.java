import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votosCandidatos = new int[4]; // Índices 0 a 3 para candidatos 1 a 4
        int votosNulos = 0;
        int votosBrancos = 0;

        System.out.println("Digite o voto de 10 eleitores (1 a 4 para candidatos, 5 para nulo, 6 para branco):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Voto do eleitor " + i + ": ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidatos[0]++;
                    break;
                case 2:
                    votosCandidatos[1]++;
                    break;
                case 3:
                    votosCandidatos[2]++;
                    break;
                case 4:
                    votosCandidatos[3]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto inválido! (Digite um número de 1 a 6)");
                    i--; // Repete a iteração para o mesmo eleitor
                    break;
            }
        }

        System.out.println("\nResultados da Eleição:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Total de votos para o candidato " + (i + 1) + ": " + votosCandidatos[i]);
        }

        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        int totalVotos = 10;
        double percentualBrancos = (votosBrancos * 100.0) / totalVotos;
        double percentualNulos = (votosNulos * 100.0) / totalVotos;

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);

        scanner.close();
    }
}