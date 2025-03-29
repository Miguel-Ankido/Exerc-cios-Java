import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Escreva um número: ");
        int num1= scanner.nextInt();

        if (num1 >= 50 && num1 <= 100) {

       
        System.out.println("Seu número esta no intervalo de 50 e 100");
    }

        else {System.out.println("Seu número NÃO pertence a o intervlao de 50 e 100");

        }
    }

    
}
