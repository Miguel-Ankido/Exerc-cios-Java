import java.util.Scanner;

public class decrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Escreva outro úmero: ");
        Double num2 = entrada.nextDouble();
        if (num1>num2) {
            
            System.out.println("A ordem decrescente desses números é: "+  + num1 + " e " + num2);
        } else {
            System.out.println("A ordem decrescente desses números é: " + num2 + " e " + num1);
            
        } 
        }     
    }


