// Aula 03 - 17/08/2026 - Exercício 1 
// Daniel Alves  de Morais - 26162686
// Criar quatro métodos: somar, subtrair, multiplicar e dividir

package Exercicios;

class Exercicio1 {

    Double num1;
    Double num2;

    // Método Somar
    public static double Somar (double num1, double num2){
        return (num1 + num2);
    }

    // Método Subtrair
    public static double Subtrair (double num1, double num2){
        return (num1 - num2);
    }

    // Método Multiplicar
    public static double Multiplicar (double num1, double num2){
        return (num1 * num2);
    }

    // Método Dividir
    public static double Dividir (double num1, double num2){
        return (num1 / num2);
    }


public static void main (String[] args){
    double num1 = 10;
    double num2 = 2;

    System.out.println("Soma: " + Somar(num1, num2));
    System.out.println("Subtração: " + Subtrair(num1, num2));
    System.out.println("Multiplicação: " + Multiplicar(num1, num2));
    System.out.println("Divisão: " + Dividir(num1, num2));
    }
}
