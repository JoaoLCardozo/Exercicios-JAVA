import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota:");
        double n1 = sc.nextDouble();
        System.out.println("Primeira nota:");
        double n2 = sc.nextDouble();
        double media = (n1+n2) /2;

        if (media == 10) { System.out.println("Aprovado com merito.");
        }
        else if (media >=7) {
            System.out.println("Passou por média");}
        else if(media < 7) { 
            System.out.println("Recuperação");
        }
        else
        {System.out.println("Média invalida");}
        sc.close();
    }
}