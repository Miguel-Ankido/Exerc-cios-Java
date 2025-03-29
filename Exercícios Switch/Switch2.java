import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        System.out.println("Insira um número para o Mês equivalente          : ");

        Scanner entrada = new Scanner(System.in);

        int menu = entrada.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Você escolheu o 1° Mês do ano ");
                System.out.println("Que corresponde ao Mês de Janeiro");
                break;
            case 2:
                System.out.println("Você escolheu o 2° Mês do ano");
                System.out.println("Que corresponde ao Mês de Fevereiro");
                break;
            case 3:
            System.out.println("Você escolheu o 3° Mês do ano");
            System.out.println("Que corresponde ao Mês de Março");
                break;
                case 4:
                System.out.println("Você escolheu o 4° Mês do ano");
                System.out.println("Que corresponde ao Mês de Abril");
                    break;
                    case 5:
                    System.out.println("Você escolheu o 5° Mês do ano");
                    System.out.println("Que corresponde ao Mês de Maio");
                        break;
                        case 6:
                        System.out.println("Você escolheu o 6° Mês do ano");
                        System.out.println("Que corresponde ao Mês de Junho");
                            break;
                            case 7:
                            System.out.println("Você escolheu o 7° Mês do ano");
                            System.out.println("Que corresponde ao Mês de Julho");
                                break;

           
            case 8:
            System.out.println("Você escolheu o 8° Mês do ano");
            System.out.println("Que corresponde ao Mês de Agosto");
                break;
                case 9:
                System.out.println("Você escolheu o 9° Mês do ano");
                System.out.println("Que corresponde ao Mês de Setembro");
                    break;
                    case 10:
                    System.out.println("Você escolheu o 10° Mês do ano");
                    System.out.println("Que corresponde ao Mês de Outubro");
                        break;
                        case 11:
                        System.out.println("Você escolheu o 11° Mês do ano");
                        System.out.println("Que corresponde ao Mês de Novembro");
                            break;
                            case 12:
                            System.out.println("Você escolheu o 12° e ultimo Mês do ano");
                            System.out.println("Que corresponde ao Mês de Dezembro");
                                break;
                default:
                System.out.println("Esse número não corresponde a nenhum mês do ano");
        }

        entrada.close();
    }
}