import java.util.Scanner;



public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.nextLine().toUpperCase().charAt(0);
        sc.close();
        

        if(Character.isLetter(letra)){
            if( letra == 'A' || letra == 'E' ||letra == 'I' || letra == 'O' || letra == 'U' ){
                System.out.println("A letra digitada é uma vogal. ");
        } else {
            System.out.println("A letra digitada é uma consoante. ");
        }
    } else {
        System.out.println("Você não digitou uma letra.");
    }
    }
    
}