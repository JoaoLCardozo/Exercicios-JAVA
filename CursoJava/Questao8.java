import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço produto 1: ");
        Double prod1 = sc.nextDouble();
        System.out.println("Preço produto 2: ");
        Double prod2 = sc.nextDouble();
        System.out.println("Preço produto 3:");
        Double prod3 = sc.nextDouble();
        sc.close();

        double melhor = prod1;

        if (prod2 < melhor)
        melhor = prod2;
        if (prod3 < melhor)
        melhor = prod3;

        System.out.printf("O melhor produto a ser comprado é o de : %.2f%n",melhor, "Reais");

    }
    
}
