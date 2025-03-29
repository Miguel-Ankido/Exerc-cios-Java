import java.util.Scanner;

public class Palpite {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Faça seu palpite: ");
        int skol = entrada.nextInt();

        if (skol == 15) {
            System.out.println("Voçê acertou!!");
        }
        else if (skol < 15) {
            System.out.println("Seu numero é menor que o objetivo");   
        }
        else {
            System.out.println("Seu numero é maior que o objetivo");
        }
    }

}
