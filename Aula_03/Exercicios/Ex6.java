// Aula 03 - 17/08/2026 - Exercício 5
// Daniel Alves  de Morais - 26162686
// Faça um programa Sistema simples de pedidos
// Apresente o seguinte cardápio. Solicite ao usuário que escolha um produto.
// Utilizando switch, exiba:
// Produto escolhido
// Preço Exemplo:
// Escolha uma opção: 2
// Produto: Pizza
// Preço: R$ 35.00
// Caso a opção não exista:
// Opção inválida.

package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cardápio do Dani: ");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Hambúguer R$ 20,00");
        System.out.println("2 - Pizza R$ 35,00");
        System.out.println("3 - Cachorro-quente R$ 15,00");
        System.out.println("4 - Refrigerante R$ 8,00");
        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Produto: Hambúrguer");
                System.out.println("Preço: R$ 20,00");
                break;
            case 2:
                System.out.println("Produto: Pizza");
                System.out.println("Preço: R$ 35,00");
                break;
            case 3:
                System.out.println("Produto: Cachorro-quente");
                System.out.println("Preço: R$ 15,00");
                break;
            case 4:
                System.out.println("Produto: Refrigerante");
                System.out.println("Preço: R$ 8,00");
                break;
            default:
                System.out.println("Opção inválida");
        }
            
    }     
}
