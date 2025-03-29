import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano_atual = 2025;

        System.out.println("Digite seu ano de nascimento: ");
        int ano_nasc = entrada.nextInt();
        int ano_30 = (2030 - ano_nasc);
        int idade = (ano_atual - ano_nasc);

        System.out.println("Sua idade é: " + idade);
        System.out.println("E sua idade em 2030 é " + ano_30);

    
    }
}
