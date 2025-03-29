import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        System.out.println("Insira um número para o dia da semana: ");

        Scanner entrada = new Scanner(System.in);

        int menu = entrada.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Você escolheu o 1° dia da semana");
                System.out.println("Que corresponde ao Domingo");
                break;
            case 2:
                System.out.println("Você escolheu o 2° dia da semana");
                System.out.println("Que corresponde ao Segunda-Feira");
                break;
            case 3:
            System.out.println("Você escolheu o 3° dia da semana");
            System.out.println("Que corresponde ao Terça-Feira");
                break;
                case 4:
                System.out.println("Você escolheu o 4° dia da semana");
                System.out.println("Que corresponde ao Quarta-Feira");
                    break;
                    case 5:
                    System.out.println("Você escolheu o 5° dia da semana");
                    System.out.println("Que corresponde ao Quinta-Feira");
                        break;
                        case 6:
                        System.out.println("Você escolheu o 6° dia da semana");
                        System.out.println("Que corresponde ao Sexta-Feira");
                            break;
                            case 7:
                            System.out.println("Você escolheu o 7° e último dia da semana");
                            System.out.println("Que corresponde ao Sábado");
                                break;
           
           
                default:
                System.out.println("Esse número não corresponde a dia algum da semana ");
        }

        entrada.close();
    }
}