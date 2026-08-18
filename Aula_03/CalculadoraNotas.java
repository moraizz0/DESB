// Exemplo classe calculadora notas

public class CalculadoraNotas {

    // Criando o primeiro metodo

    public static double calcularMedia(Double nota1, Double nota2){
        return (nota1+nota2)/2;
    }

    // Cria o metodo para verificar a situacao

    public static String verificarSituacao(Double media){
        if(media >=7){
            return "Aprovado";
        }
        else if (media >= 5){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }

    // Cria metodo chamado exibir resultados

    public static void exibirResultado(String nome, Double media, String situacao){
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

    // Cria o metodo void main
   
    public static void main(){
        String nome = "Mariana ";
        Double nota1 = 5.0;
        Double nota2 = 9.0;
        Double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);
    }

}