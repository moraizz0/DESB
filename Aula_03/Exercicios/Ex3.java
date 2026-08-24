// Aula 03 - 17/08/2026 - Exercício 3
// Daniel Alves  de Morais - 26162686
// Verificação de maioridade. Crie um programa que solicite a idade de uma pessoa
// O programa deverá informar:
// - "Menor de idade" para idade menor que 18
// - "Maior de idade" para idade igual ou maior que 18

package Exercicios;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        
        if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
        
    }
}
