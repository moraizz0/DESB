// Exemplo de programa em Java

// importando a biblioteca do Scanner
import java.util.Scanner; //Permite capturar as informações digitadas pelo usuário

public class Main {
    //Cria uma função chamada main
    public static void main (String [] args){
        //Criando o objeto scanner 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String  nome = sc.nextLine(); // Armazena o nome do aluno

        System.out.println("Digite a primeira nota: ");
        Double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = sc.nextDouble();

        Double media = ((nota1 + nota2) / 2);

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >=7){
            System.out.println("Situação: Aprovado!");
        }
        else if (media >+ 5){
            System.out.println("Situação: Recuração");
        }
        else {
            System.out.println("Situação: Reprovado");
        }
        sc.close();
    }
    
}
