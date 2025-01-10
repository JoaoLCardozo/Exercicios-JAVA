import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double n3 = sc.nextDouble();
        sc.close();

        double maior = n1;
        double menor = n1;

        if (n2 > maior){
            maior = n2;
        }
        if (n3 > maior){
            maior = n3;
        }
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.printf("O maior número é: %.2f%n", maior);
        System.out.printf("O menor número é: %.2f%n", menor);

    }
    
}
