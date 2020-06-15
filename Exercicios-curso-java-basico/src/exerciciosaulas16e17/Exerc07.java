
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int maior = 0;
        int menor = 0;
        
        System.out.print("Informe o 1º número: ");
        int priNumero = input.nextInt();
        System.out.print("Informe o 2º número: ");
        int segNumero = input.nextInt();
        System.out.print("Informe o 3º número: ");
        int terNumero = input.nextInt();
        System.out.print("Informe o 4º número: ");
        int quaNumero = input.nextInt();
        System.out.print("Informe o 5º número: ");
        int quiNumero = input.nextInt();
        
        if(priNumero > segNumero && priNumero > terNumero && priNumero > quaNumero && priNumero > quiNumero){
            System.out.println("O maior é o primeiro número: " + priNumero);
        } else if (segNumero > priNumero && segNumero > terNumero && segNumero > quaNumero && segNumero > quiNumero){
            System.out.println("O maior é o segundo número: " + segNumero);
        } else if (terNumero > priNumero && terNumero > segNumero && terNumero > quaNumero && terNumero > quiNumero){
            System.out.println("O maior é o terceiro número: " + terNumero);
        } else if (quaNumero > priNumero && quaNumero > segNumero && quaNumero > terNumero && quaNumero > quiNumero){
            System.out.println("O maior é o quarto número: " + quaNumero);
        } else {
            System.out.println("O maior é o quinto número: " + quiNumero);
        }
    }
    
}
