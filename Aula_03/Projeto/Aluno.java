package Projeto;

public class Aluno {
    // Criando atributos 
    String nome;
    int idade;
    Double nota1;
    Double nota2;

    void apresentar(){
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho " + idade + " anos");
    }

        Double calcularMedia(){
        return (nota1 +nota2)/2;

    }

    // Metodo verificar situação

    String verificarSituacao(){
        Double media = calcularMedia();

        if(media>= 7){
            return "Aprovado";

        }else if (media >=5){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }
    
}
