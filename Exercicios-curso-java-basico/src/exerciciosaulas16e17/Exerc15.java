
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o n-ésimo termo da série de Fibonacci: ");
        int n = input.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int auxiliar;
        
        System.out.print(primeiro + " - ");
        System.out.print(segundo + " - ");
        
        for(int i = 3; i <= n; i++){
            auxiliar = primeiro + segundo;
            primeiro = segundo;
            segundo = auxiliar;
            System.out.print(auxiliar + " - ");
        }
        
    }
    
}
