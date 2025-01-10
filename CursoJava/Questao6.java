import java.util.Scanner;



public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Escreva o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Escreva o terceiro número: ");
        double n3 = sc.nextDouble();

        if (n1 > n2 && n1 > n3){
            System.out.printf("O maior número digitado foi: %.2f%n", n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.printf("O maior número digitado foi: %.2f%n", n2);
        }else {
            System.out.printf("O maior número digitado foi: %.2f%n", n3);
            sc.close();
        }

    }
    
}
