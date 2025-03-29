import java.util.Scanner;

public class senha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        if(senha.equals("R10p5")) { System.out.printf("Acesso concedido ");

        } else {System.out.println("Acesso negado " + "Tente Novamente");}
    
    }



}