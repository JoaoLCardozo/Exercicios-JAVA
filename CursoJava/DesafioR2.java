import java.util.Scanner;

public class DesafioR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario recebido: ");
        double salario = sc.nextDouble();
        System.out.println("Digite a remuneração pelas horas extras: ");
        double hExtra = sc.nextDouble();
        System.out.println("Digite a comissão recebida: ");
        double comissão = sc.nextDouble();
        double salarioBruto = (salario + hExtra + comissão);

        double impostoRenda = (salarioBruto * 0.05);
        double INSS = (salarioBruto * 0.11);
        double salarioLiquido = (salarioBruto - INSS) - impostoRenda;

        System.out.printf("Valor do INSS: %.2f%n", INSS);
        System.out.printf("valor do imposto de renda: %.2f%n", impostoRenda);
        System.out.printf("Salário líquido: %.2f%n", salarioLiquido);
        sc.close();

    }
    
}
