import java.util.Scanner;

//bônus de 20%do valor do salário a todos os funcionários com tempos de trabalho na empresa igual 
//ou superior a cinco anos e de 10% aos demais funcionários.


public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano entrou para a empresa? ");
        int ano = scanner.nextInt();

        System.out.println("Qual o seu salário atual? ");
        double salario = scanner.nextDouble();

        if (ano < 2020) { System.out.println("Voçê terá um bônus de 20% no seu salário :) e seu novo salário é de: " + (salario*1.2)); 

        } 
        else { System.out.println("Voçê ganhará um bonûs de 10% em seu salário :) e seu novo salário é de: " + (salario*1.1));

        }

    System.out.println("Esperamos que continue contribuindo conosco");
    }

}
