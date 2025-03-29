import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
// codigo precisa da média de 3 notas de 1 aluno
        System.out.println("Digite a sua primeira nota: ");
        int nota1 = entrada.nextInt();

        System.out.println("Digite a sua segunda nota: ");
        int nota2 = entrada.nextInt();
        
        System.out.println("Digite a sua terceira nota: ");
        int nota3 = entrada.nextInt();

        int media = (nota1+nota2+nota3)/3; 


        System.out.println("A sua média é de: " + media);


    }
    
}
