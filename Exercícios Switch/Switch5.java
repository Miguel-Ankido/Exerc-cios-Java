//Algoritmo precisa receber 2 números
//M	média entre os números digitados        S	diferença do maior pelo menor
//P	produto entre os números digitados      D	divisão do primeiro pelo segundo

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       System.out.println("Escolha o primeiro número: ");
       int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        entrada.nextLine();
        double media;
        int produto;
        int difer;
        double div;
    

        System.out.println("Escolha a operação que deseja Realizar:");
        System.out.println("M Para média entre os números");
        System.out.println("P Para o produto entre os números");
        System.out.println("S Para a diferenca entre os números");
        System.out.println("D Para a divisão entre os números");

        String operacao = entrada.nextLine();

        switch (operacao) {
            case "M":
            media = ((num1 + num2)/2);
            System.out.println("A média dos números " + num1 + " " + num2 + " = " + media );
            
            break;
           
            case "P":
            produto = num1 * num2;
    System.out.println("O produto entre os números é: " + produto);
    break;
    
case "S":
difer = (num1 - num2); // Use Math.abs para garantir que a diferença seja sempre positiva
    System.out.println("A diferença entre os números " +num1 + " "+ num2 + " é " + difer);
    break;
    
case "D":
    if (num2 != 0) {
        div = (double) num1 / num2;
        System.out.println("A divisão do primeiro pelo segundo número é: " + div);
    } else {
        System.out.println("Erro: Divisão por zero não é permitida.");
    }
    break;
    }    
}
}