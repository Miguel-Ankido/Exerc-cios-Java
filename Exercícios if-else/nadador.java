import java.util.Scanner;


public class nadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Insira sua idade: ");
       int idade = scanner.nextInt();
        boolean infantilA = ((idade>=5) && (idade<=7));
        boolean infantilB = ((idade>=8) && (idade<=10));
        boolean juvenilA = ((idade>=11) && (idade<=13));
        boolean juvenilB = ((idade>=14) && (idade<=17));
        boolean senior = (idade>=18);
       if (infantilA) { System.out.println("Você está na categoria Infantil A - idade entre 5 e 7");
       } else if (infantilB) { System.out.println("Você está na categoria Infantil B - idade entre 8 e 10 ");
    } else if (juvenilA) { System.out.println("Você está na categoria Juvenil A - idade entre 11 e 13 ");

}else if (juvenilB) { System.out.println("Você está na categoria Juvenil B - idade entre 14 e 17 ");

}else if (senior) { System.out.println("Você está na categoria Sênior - Apensa para adultos");
    
} else {System.out.println("Você não possui idade suficiente para nadar");

}


}
}

