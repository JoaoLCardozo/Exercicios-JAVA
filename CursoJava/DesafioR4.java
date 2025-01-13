import java.util.Scanner;

public class DesafioR4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respostasPositivas = 0;

        System.out.println("Responda com 'sim' ou 'não' às perguntas abaixo:");

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = sc.next().toLowerCase();
        if (resposta1.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        String resposta2 = sc.next().toLowerCase();
        if (resposta2.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        String resposta3 = sc.next().toLowerCase();
        if (resposta3.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        String resposta4 = sc.next().toLowerCase();
        if (resposta4.equals("sim")) {
            respostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = sc.next().toLowerCase();
        if (resposta5.equals("sim")) {
            respostasPositivas++;
        }

        System.out.println("\nClassificação:");
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
        sc.close();
    }
}