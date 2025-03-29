import java.util.Scanner; 

public class Exer1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite um número: ");
        double num1 = entrada.nextInt();

        if (num1 >20 ) {
            double metade = (num1/2);
            System.out.println("A metade desse número é: " + metade);
             }
       else {
        System.out.println("O número precisa ser maior que 20");
       
       entrada.close();
    }
    }
}
