
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc34 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double soma = 0;
        
        System.out.print("Digite o valor de n: ");
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            soma += 1/i;
        }
        System.out.println("Soma = " + soma);
    }
    
}
