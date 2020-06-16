
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número (base): ");
        int base = input.nextInt();
        System.out.print("Informe os egundo número (expoente): ");
        int expo = input.nextInt();
        int resp = 1;
        
        for(int i = 0; i < expo; i++){
            resp *= base;
        }
        System.out.println("O resultado da expressão é = " + resp);
    }
    
}
