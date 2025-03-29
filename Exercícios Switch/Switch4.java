import java.util.Scanner;

//Um funcionário receberá aumento de acordo com seu plano de 	trabalho.
//Faça um algoritmo que leia:
//¨ o plano de trabalho; // Plano A - 10% Plano B - 15% Plano C - 20%
//¨ e o salário atual de um funcionário;
// Calcule e imprima o seu novo salário
public class Switch4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita o salário atual do funcionário
        System.out.println("Insira seu salário atual: ");
        double salario = entrada.nextDouble();

        // Consumir a nova linha deixada pelo nextDouble()
        entrada.nextLine();

        // Exibe as opções de plano de trabalho
        System.out.println("Qual o seu Plano de Trabalho? A empresa possui: ");
        System.out.println("Plano A - 10% de aumento");
        System.out.println("Plano B - 15% de aumento");
        System.out.println("Plano C - 20% de aumento");

        String plano = entrada.nextLine();

        double novoSalario = 0;
        switch (plano.toUpperCase()) {
            case "A":
                novoSalario = salario * 1.10;
                System.out.println("Plano A selecionado. Aumento de 10%.");
                break;
            case "B":
                novoSalario = salario * 1.15;
                System.out.println("Plano B selecionado. Aumento de 15%.");
                break;
            case "C":
                novoSalario = salario * 1.20;
                System.out.println("Plano C selecionado. Aumento de 20%.");
                break;
            default:
                System.out.println("Plano inválido. Nenhum aumento aplicado.");
                novoSalario = salario; // Mantém o salário atual se o plano for inválido
                break;
        }

        // Exibe o novo salário
        System.out.printf("Seu novo salário é: R$ %.2f%n", novoSalario);

        entrada.close();
    }
}