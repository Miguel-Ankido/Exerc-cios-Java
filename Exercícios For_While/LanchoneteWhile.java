import java.util.Scanner;

public class LanchoneteWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0.0;
        int continuar = 1;

        while (continuar == 1) {
            System.out.println("Cardápio:");
            System.out.println("| Código | Produto           | Preço  |");
            System.out.println("| 100    | Cachorro quente   | R$1,20 |");
            System.out.println("| 101    | Bauru Simples     | R$1,30 |");
            System.out.println("| 102    | Bauru com ovo     | R$1,50 |");
            System.out.println("| 103    | Hambúrguer        | R$1,20 |");
            System.out.println("| 104    | Cheeseburguer     | R$1,30 |");
            System.out.println("| 105    | Refrigerante      | R$1,00 |");

            System.out.print("Digite o código do produto: ");
            int codigo = scanner.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            double preco = 0.0;
            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.printf("Total para este produto: R$%.2f\n", totalProduto);

            System.out.print("Deseja continuar comprando? (1 para Sim, 0 para Não): ");
            continuar = scanner.nextInt();
        }

        System.out.printf("Total da compra: R$%.2f\n", totalCompra);
        scanner.close();
    }
}