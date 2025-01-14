import java.util.Scanner;

public class QuestaoLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estCiv;
        
        do{
             System.out.println("Digite um nome com 3 ou mais caracteres: ");
            nome = sc.nextLine();
            if (nome.length() < 3){
                System.out.println("O nome digitado tem menos de 3 caracteres ");
        }
    }
    while (nome.length() < 3 );

    do{
        System.out.println("Digite uma idade de 0 até 150: ");
        idade = sc.nextInt();
        if (idade < 0 || idade > 150){
            System.out.println("Idade Digitada inválida. ");
        }
    }
    while (idade < 0 || idade >150);

    do{
        System.out.println("Digite um salário (maior que 0): ");
        salario = sc.nextDouble();
        if (salario <= 0){
            System.out.println("O salário digitado é inválido. ");
        }
    }
    while (salario <= 0 );

    do {
        System.out.println("Digite seu sexo (f ou m) :");
        sexo = sc.next().toUpperCase().charAt(0);
        if(sexo != 'F' && sexo != 'M'){
            System.out.println("sexo inválido. ");
        }
    }
    while (sexo != 'F' && sexo != 'M');

    do{
        System.out.println("Digite seu estado civil (S = Solteiro(a), C = Casado(a), V = Viúvo(a), D = Divorciado(a)): ");
        estCiv = sc.next().toUpperCase().charAt(0);
        if (estCiv != 'S' && estCiv != 'C' && estCiv != 'V' && estCiv != 'D'){
            System.out.println("Estado cívil inválido. ");
        }
    }
    while (estCiv != 'S' && estCiv != 'C' && estCiv != 'V' && estCiv != 'D');

    String sexoLer;
    String estLer;

    if(sexo == 'F'){
        sexoLer = "Feminino";
    }
    else {
        sexoLer = "Masculino";
    }

    if(estCiv == 'S'){
        estLer = "Solteiro(a)";
    }
    else if(estCiv == 'C'){
        estLer = "Casado(a)";
    }
    else if(estCiv == 'V'){
        estLer = "Viúvo(a)";
    }
    else{
        estLer = "Divorciado(a)";
    }
    System.out.println("Cadastro realizado com sucesso." + "\nNome:" + nome + "\nIdade: " + idade + "\nSalário: " + salario + "\nSexo: " + sexoLer + "\nEstado Civil: "+ estLer);
    sc.close();

    }
}