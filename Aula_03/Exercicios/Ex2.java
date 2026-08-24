// Aula 03 - 17/08/2026 - Exercício 2
// Daniel Alves  de Morais - 26162686
// Crie um programa para solicitar ao usuário seu nome e exibir no terminal

package Exercicios;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Seu nome é: " + nome);
    }
}
