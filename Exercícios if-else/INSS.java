import java.util.Scanner;
//desconto do INSS <= R$ 600,00 Isento
//> R$ 600,00e <= R$ 1200,00 20%
//> R$ 1200,00e <= R$ 2000,00 25%
//<= R$ 2000,00 30%

public class INSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Insira seu sálario BRUTO: ");
        double salario = scanner.nextDouble();
        double inicial = (salario*0.2);
        double medio = (salario*0.25);
        double dificil = (salario*0.30);

        if (salario<=600) {System.out.println("Você está isento de descontos");
        } else if ((salario>600) && (salario<=1200)) {
            System.out.println("Será descontado 20% do seu salário, valor: " + inicial);
        } else if ((salario>1200) && (salario<=2000)) {
            System.out.println("Será descontado 25% do seu salário, valor: " + medio);
        
        } else if (salario>2000) {
            System.out.println("Será descontado 30% do seu salário, valor: " +dificil);

    }
}
}