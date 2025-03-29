import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Impossível dividir por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Sinal inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}