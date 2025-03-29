import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double num = entrada.nextInt();

        double numquadrado = (num*num);
        double numcubo = (num*num*num);
        double numraiz = Math.sqrt(num);
        double numpot = Math.pow(num, 10);

        System.out.println("O quadrado desse número é: " + numquadrado);
        System.out.println("O cubo desse número é: " + numcubo);
        System.out.println("A raiz desse número é: "+numraiz);
        System.out.println("Esse número elevado a décima potência é: "+numpot);

    }
    
}
