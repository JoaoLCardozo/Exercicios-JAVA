import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("O valor de 'a' é zero. A equação não é do segundo grau.");
            sc.close();
            System.exit(0);
        }
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.println("DIgite o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4* a * c); 

        if (delta < 0) {
            System.out.println("O delta é negativo. A equação não possui raizer reais.");
            System.exit(0);
        } else if(delta == 0) {
        double raizUnica = -b /(2* a);
        System.out.printf("O delta é zero. A equação possui uma única raiz real: ", raizUnica);

        }else{
            double raiz1 = (-b + Math.sqrt(delta)) /(2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) /(2 * a);
            System.out.printf("O delta é positivo. A equação possui duas raizes reais.");
            System.out.printf("Raiz 1 : %.2f%n", raiz1);
            System.out.printf("Raiz 2 : %.2f%n", raiz2);
        }
    }
}
