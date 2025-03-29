import java.util.Scanner;

public class pesoideal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu sexo? (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0); 
       
        System.out.println("Digite sua altura em metros (ex.: 1,75): ");
        double altura = scanner.nextDouble();

        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') { // Homem
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') { // Mulher
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
            return; 
        }

        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

       
    }
}