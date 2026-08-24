// Aula 03 - 17/08/2026 - Exercício 4 
// Daniel Alves  de Morais - 26162686
// Solicite dois números ao usuário. O programa deverá informar:
// - Qual dos dois números é maior;
// - Ou se os dois são iguais.

package Exercicios;

import java.util.Scanner;

    public class Ex4 {
    
        public static void main(String [] args) {
             Scanner sc = new Scanner(System.in);

             System.out.println("Insira o primeiro número: ");
             int x = sc.nextInt();

             System.out.println("Insira o segundo número: ");
             int y = sc.nextInt();
        
            if (x == y){
                 System.out.println("Os números são iguais");
            }
            else if (x > y) {
                System.out.println( x + " > " + y);
            }
            else {
                System.out.println( y + " > " + x);
            }
          
    }

}
