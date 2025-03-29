public class Exc7 {
    public static void main(String[] args) {
        // Expressão 1: ((120 - 30) == (3 ^ 30))
        // Corrigindo: ^ é XOR em Java, para potência usamos Math.pow()
        boolean resultado1 = (120 - 30) == Math.pow(3, 30);
        System.out.println("Resultado da expressão 1: " + resultado1);

        // Expressão 2: (!((20 % 4) == 1) || (9 != 9))
        boolean resultado2 = (!((20 % 4) == 1)) || (9 != 9);
        System.out.println("Resultado da expressão 2: " + resultado2);

        // Expressão 3: ((5 % 2) > 3)
        boolean resultado3 = (5 % 2) > 3;
        System.out.println("Resultado da expressão 3: " + resultado3);

        // Expressão 4: (a == A)
        // Assumindo que a e A são variáveis diferentes
        int a = 10;
        int A = 20;
        boolean resultado4 = (a == A);
        System.out.println("Resultado da expressão 4: " + resultado4);
    }
}