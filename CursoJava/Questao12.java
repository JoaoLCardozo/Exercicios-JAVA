import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora trabalhada (R$): ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoIR = 0;

        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double descontoInss = salarioBruto * 0.1;
        double totalDescontos = descontoIR + descontoSindicato + descontoInss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + horasTrabalhadas + " * R$ " + String.format("%.2f", valorHora) + " = R$ " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR (" + getPorcentagemIR(salarioBruto) + "%) : R$ " + String.format("%.2f", descontoIR));
        System.out.println("(-) Sindicato (3%): R$ " + String.format("%.2f", descontoSindicato));
        System.out.println("(-) INSS (10%): R$ " + String.format("%.2f", descontoInss));
        System.out.println("FGTS (11%): R$ " + String.format("%.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));

        sc.close();
    }

    public static int getPorcentagemIR(double salarioBruto) {
        if (salarioBruto <= 900) {
            return 0;
        } else if (salarioBruto <= 1500) {
            return 5;
        } else if (salarioBruto <= 2500) {
            return 10;
        } else {
            return 20;
        }
    }
}
