import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = sc.nextLine();


        String[] partes = data.split("/");
        if (partes.length != 3) {
            System.out.println("Formato inválido. Use o formato dd/mm/aaaa.");
            sc.close();
            return;
        }

        try {

            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);


            if (dataValida(dia, mes, ano)) {
                System.out.println("A data informada é válida.");
            } else {
                System.out.println("A data informada é inválida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Certifique-se de que o dia, mês e ano sejam números.");
        }

        sc.close();
    }


    public static boolean dataValida(int dia, int mes, int ano) {

        if (mes < 1 || mes > 12) {
            return false;
        }


        if (ano < 1) {
            return false;
        }


        int diasNoMes;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasNoMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:

                diasNoMes = (anoBissexto(ano)) ? 29 : 28;
                break;
            default:
                return false;
        }

        return dia >= 1 && dia <= diasNoMes;
    }

    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
