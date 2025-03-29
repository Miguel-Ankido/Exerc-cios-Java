import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >=18) {
        System.out.println("Voçê é maior de idade");
    }
         else {
        System.out.println("Voçê é de menor");
        entrada.close(); 
     
        }
    }
}
