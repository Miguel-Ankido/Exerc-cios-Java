import java.util.Scanner;
//o valor máximo da prestação não poderá ultrapassar 30%do salário bruto.
//fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o
//empréstimo pode ou não ser concedido.

public class prefeitura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor informe o seu salário atual: ");
        double salario = scanner.nextDouble();
        
        
        System.out.println("Quanto de prestação gostaria de receber? ");
        double prestacao = scanner.nextDouble();

        if (prestacao>(salario*0.3)) {System.out.println("Você não esta apto a solicitar esta prestação");
   
    } else {System.out.println("A sua solicitação está concluida");

    }

    }
}
