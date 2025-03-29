public class Tabuada5 {
    public static void main(String[] args) {
        int numero = 5;
        int i = 1;

        System.out.println("Tabuada do " + numero + ":");

        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }
}