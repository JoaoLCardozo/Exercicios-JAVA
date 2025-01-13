import java.util.Scanner;

public class DesafioR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seu peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.println("Sua altura (em metros): ");
        double altura = sc.nextDouble();
        double IMC = peso / (altura * altura);

        System.out.printf("Seu é IMC: %.2f%n ", IMC);

        if (IMC <20){
            System.out.println("Situação: Abaixo do peso. ");
        } else if(IMC >=20 && IMC < 25) {
            System.out.println("Situação: Peso normal. ");
        } else if(IMC >= 25 && IMC < 30 ) {
            System.out.println("Situação: Sobre Peso. ");
        }else if(IMC >= 30 && IMC < 40) {
            System.out.println("Situação: Obeso.");
        }else {
            System.out.println("Situação: Obeso Mórbido.");
        }
        sc.close();

    }
    
}
