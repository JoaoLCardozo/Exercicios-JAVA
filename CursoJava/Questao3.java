import java.util.Scanner;


public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Escreva seu sexo: ('M' para masculino e 'F' para feminino)");
        char sexo = sc.nextLine().toUpperCase().charAt(0);

        if (sexo == 'M'){System.out.println("Masculino");
    }else if( sexo == 'F'){System.out.println("Feminino");}
    else{System.out.println("Você não digitou nem F nem M.");}

    }
    
}