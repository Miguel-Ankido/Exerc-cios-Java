import java.util.Scanner;
//Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
//– O algoritmo deve ler três inteiros;
//– se forem todos iguais, imprimir: “os números são iguais”;
//– caso contrário, imprimir o maior dos 3 números.

public class maior3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Escreva o primeiro número inteiro: ");
       int num1 = scanner.nextInt();
       System.out.println("Escreva o segundo número inteiro: ");
       int num2 = scanner.nextInt();
       System.out.println("Escreva o terceiro número inteiro: ");
       int num3 = scanner.nextInt();
       boolean igual = (num1 == num2) && (num2 == num3);
       if (igual) {System.out.println("Os números são iguais");

       } else if ((num1>num2) && (num2>num3)) { System.out.println("O maior dos 3 números é o primeiro: "+ num1);
} else if ((num2>1) && (num1>num3)) {System.out.println("O maior dos 3 números é o segundo: "+ num2);
    
}else {System.out.println(" O maior número é o terceirro: " + num3);

}



}
}