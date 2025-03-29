    //M - Matutino;
    //V - Vespertino;
    //N - Noturno.
    import java.util.Scanner;

    public class Switch3 {
        public static void main(String[] args) {
    
            System.out.println("Insira o período em que você estuda: ");
            System.out.println("Considere que: M - Matutino");
            System.out.println("V - Vespertino");
            System.out.println("N - Noturno");
            System.out.println("*Insirir em letra maiúscula");
    
            Scanner entrada = new Scanner(System.in);
    
            String periodo = entrada.nextLine();
    
            switch (periodo) {
                case "M" :
                    System.out.println("Olá Bom Dia!!");
                    System.out.println("Você estuda no período matutino");
                    break;
                case "V":
                    System.out.println("Olá Boa Tarde!!");
                    System.out.println("Você estuda no período vespertino");
                    break;
                case "N":
                System.out.println("Olá Boa Noite!!");
                System.out.println("Você estuda no período noturno");
                    break;

                    default:
                    System.out.println("Essa letra não corresponde a nenhuma das alternativas!!");
            }
    
            entrada.close();
        }
    }
