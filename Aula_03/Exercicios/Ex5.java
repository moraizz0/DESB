// Aula 03 - 17/08/2026 - Exercício 5
// Daniel Alves  de Morais - 26162686
// Desconto em uma compra
// Solicite o valor total de uma compra. A loja possui as seguintes regras:
// Até R$ 100,00 Sem desconto
// Acima de R$ 100,00 até R$ 500,00 10% de desconto
// Acima de R$ 500,00 15% de desconto
// O programa deverá mostrar:Valor da compra
// Valor do desconto Valor final

package Exercicios;

import java.util.Scanner;

public class Ex5 {
            public static void main(String [] args) {
             Scanner sc = new Scanner(System.in);

             System.out.println("Insira o valor total da compra: ");
             Double valor = sc.nextDouble();

             Double desconto; 
             Double valorFinal;
        
            if (valor <= 100){
                 System.out.println("Valor da compra: R$ " + valor);
                 System.out.println("Sem desconto.");
            }
            else if (valor > 100 && valor <= 500) {
                desconto = valor * 0.01;
                valorFinal = valor - desconto;
                System.out.println( "Valor da compra: R$ " + valor);
                System.out.println("Desconto: R$ " + desconto);
                System.out.println("Valor a pagar: R$ " + valorFinal); 
            }
            else {
                desconto = valor * 0.15;
                valorFinal = valor - desconto;
                System.out.println ("Valor da compra: R$ " + valor);
                System.out.println( "Desconto: R$ " + desconto);
                System.out.println ("Valor a pagar: R$ "  + valorFinal);
            }
          
    }
}
