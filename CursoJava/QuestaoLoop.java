import java.util.Scanner;


public class QuestaoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        do {
            System.out.println("Escreva uma nota de 0 a 10");
            nota = sc.nextDouble();
        }while (nota>=0 || nota <=10);
        sc.close();

    }
    
}
