
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o numero do fatorial: ");
        int numero = input.nextInt();
        
        System.out.println(numero + "! = " + numero + " * ");
        
        int fatorial = 1;
        for(int i = numero; i > 0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado " + fatorial);
    }
}
