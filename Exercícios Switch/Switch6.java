import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean finalizarCompra = false; //variável para controlar o loop
        double totalCompra = 0.0;
        
        while (!finalizarCompra) {
        
        System.out.println("***Bem vindo a lanchonete!!***");
        System.out.println("Selecione o produto que deseja com base em seu código:");
        System.out.println("100 - Cachorro Quente, Preço: R$ 1,20.");
        System.out.println("101 - Bauru Simples, Preço: R$ 1,30.");
        System.out.println("102 - Bauru com Ovo, Preço: R$ 1,50.");
        System.out.println("103 - Hambúrguer, Preço: R$ 1,20.");
        System.out.println("104 - Cheeseburguer, Preço: R$ 1,30.");
        System.out.println("105 - Refrigerante, Preço: R$ 1,00.");
        System.out.println("0 - Desejo finalizar a compra");
    
        // le o código do produto
        int cod = entrada.nextInt();

        switch (cod) {
            case 100:
                System.out.println("Você escolheu o Cachorro Quente. Preço: R$ 1,20.");
                System.out.println("Quantidade desejada:");
              int quantcachorro = entrada.nextInt();
                totalCompra += 1.20*quantcachorro;
              
                break;
            case 101:
                System.out.println("Você escolheu o Bauru Simples. Preço: R$ 1,30.");
                System.out.println("Quantidade desejada:");
               int quantbauru = entrada.nextInt();
                totalCompra += 1.30*quantbauru;
               
                break;
            case 102:
                System.out.println("Você escolheu o Bauru com Ovo. Preço: R$ 1,50.");
                System.out.println("Quantidade desejada:");
              int quantbaurovo = entrada.nextInt();
                totalCompra += 1.50*quantbaurovo;

                break;
            case 103:
                System.out.println("Você escolheu o Hambúrguer. Preço: R$ 1,20.");
                System.out.println("Quantidade desejada:");
              int quanthambur = entrada.nextInt();
                totalCompra += 1.20*quanthambur;
              
                break;
            case 104:
                System.out.println("Você escolheu o Cheeseburguer. Preço: R$ 1,30.");
                System.out.println("Quantidade desejada:");
                int quantxburg = entrada.nextInt();
                totalCompra += 1.30*quantxburg;
    
                break;
            case 105:
                System.out.println("Você escolheu o Refrigerante. Preço: R$ 1,00.");
                System.out.println("Quantidade desejada:");
               int quantrefri = entrada.nextInt();
                totalCompra += 1.00*quantrefri;    
                break;
            case 0:
               finalizarCompra  = true;
                System.out.println("Finalizando compra, Total a ser pago: " + totalCompra);
                break;
            default:
                System.out.println("Código inválido. Por favor, selecione um código válido.");
                break;
        }
        if (finalizarCompra) { System.out.printf("Total parcial da compra: R$ %.2f%n", totalCompra);
            System.out.println("Obrigado pela preferência e volte sempre!!");  
        }
    }
        entrada.close();
    }
}