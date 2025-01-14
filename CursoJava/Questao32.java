import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de cinco dígitos: ");
        String numero = sc.nextLine();

        if (numero.lenght() != 5 || numero.matches("\\d+")){
            System.out.println("Erro: Você deve digitar um número com exatamente 5 digitos. ");
        }else{
            if (isPalindromo(numero)){
                System.out.println("O número " + numero + "é um palindromo. ");
            }else {
                System.out.println("O número " + numero + "não é um palindormo.");
            }
        }
        sc.close();
    }
    
}public static boolean isPalindromo(String numero){
    int n = numero.length();
    for( int i = 0; i <n / 2 ; i++){
        if(numero.charAt(i) != numero.charAt(n - 1 -i))
    }
}
