import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Escreva um número inteiro: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int num2 = entrada.nextInt();
        int diferenca;
        int diferenca2;
        int maior, menor;
        if (num1>num2) {
           maior=num1;
           menor=num2;
           diferenca=(maior-menor);
           System.out.println("Seus números são diferentes e a diferença é: " + diferenca);
        }
        else if (num1==num2) {
            System.out.println("Os números são iguais");
        }
        else {
            maior=num2;
            menor=num1;
            diferenca2=(maior-menor);
            System.out.println("Seus números são diferentes e a diferença é: " + diferenca2);
        }    
    }
}
