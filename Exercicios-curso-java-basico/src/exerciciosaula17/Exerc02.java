
package exerciciosaula17;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int [8];
        int[] vetorB = new int [vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Informe o " + (i + 1) + "º valor do vetor A: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
    }
    
}
