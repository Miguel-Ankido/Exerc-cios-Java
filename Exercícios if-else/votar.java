import java.util.Scanner;
//alfabetizado
//brasileiro, naturalizado ou nascido
//idade 18-70 (obrigatório) (optativo para pessoas com idade maior de 60, ou entre 16-17 e analfabetas)

public class votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Responda as proximas perguntas para saber se você se encontra apto a votar: ");
    System.out.println("Alfabetizado?");
    String ler = scanner.nextLine();
    
    System.out.println("Naturalizado ou nascido no Brasil?");
    String nasc = scanner.nextLine();

    System.out.println("Idade: ");
    int idade = scanner.nextInt();
    
    }
}