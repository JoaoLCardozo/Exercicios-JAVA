import java.util.Scanner;

public class DesafioR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do carro: ");
        double custoC = sc.nextDouble();
        double impostos = 0.45;
        double distribuidor = 0.28;
        double impostosT = (impostos + distribuidor);
        double precoFinal = (custoC*impostosT)+custoC;
        System.out.printf("Preço final é: %.2f%n", precoFinal);
        sc.close();
        
    }
    
}
