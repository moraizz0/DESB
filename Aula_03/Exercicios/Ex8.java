// Aula 03 - 17/08/2026 - Exercício 5
// Daniel Alves  de Morais - 26162686
// Sistema de atendimento bancário
// Solicite ao usuário o saldo inicial da conta
// Depois apresente:
// 1 - Consultar saldo
// 2 - Depositar
// 3 - Sacar
// 4 - Sair
// Opção 1 - Exibir o saldo atual.
// Opção 2 - Solicitar o valor do depósito.
// O depósito deve ser maior que zero.
// Opção 3 - Solicitar o valor do saque.
// O programa deverá verificar:
// Valor do saque > 0
// e: Valor do saque <= saldo
// Caso contrário, informar:
// Saldo insuficiente
// ou: Valor inválido
// Opção 4 - Exibir: Programa encerrado


package Exercicios;

import java.util.Scanner;

public class Ex8 {
        public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao sistema bancário!");
        System.out.println("Primeiro, informe seu saldo inicial: ");
        Double saldoInicial = sc.nextDouble();
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        int operacao = sc.nextInt();

        Double saldoAtual = saldoInicial;

        switch (operacao){
            case 1:
                System.out.println("Saldo Atual: " + saldoAtual);
                break;
            case 2:
                System.out.println("Insira o valor do depósito: ");
                Double vDeposito = sc.nextDouble();
                if (vDeposito > 0){
                    System.out.println("Depósito realizado");
                    saldoAtual = saldoInicial + vDeposito;
                    System.out.println("Saldo atual: R$ " + saldoAtual);
                }
                else {
                    System.out.println("Valor invalido");
                }
                break;
            case 3:
                System.out.println("Insira o valor do saque: ");
                Double vSaque = sc.nextDouble();
                if (vSaque > 0 && vSaque <= saldoAtual){
                    System.out.println("Saque realizado");
                    saldoAtual = saldoInicial - vSaque;
                    System.out.println("Saldo atual: R$ " + saldoAtual);
                }
                else{
                    System.out.println("Valor inválido ou saldo insuficiente");
                }
                break;
            case 4:
                System.out.println("Programa encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }   
    
}
