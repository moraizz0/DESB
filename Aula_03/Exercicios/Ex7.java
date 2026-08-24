// Aula 03 - 17/08/2026 - Exercício 5
// Daniel Alves  de Morais - 26162686
// Crie um programa para calcular o IMC do usuario. Solicite:
// Peso em kg
// Altura em metros
// Calcule IMS = peso / (altura * altura)
// Classifique o resultado: 
// IMC < 18.5 - Abaixo do peso
// 18.5 até 24.9 - Peso normal
// 25 até 29.9 - Sobrepeso
// 30 ou mais - Obesidade

package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg: ");
        Double peso = sc.nextDouble();

        System.out.println("Insira a sua altura em metros: ");
        Double altura = sc.nextDouble();

        Double IMC = peso / (altura * altura);

        if (IMC < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (IMC >= 18.5 && IMC < 24.9){
            System.out.println("Peso normal");
        }
        else if (IMC >= 25 && IMC < 29.9){
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obesidade");
        }
    }
}
