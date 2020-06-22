package exerciciosaula17;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        /* Vai pedir os elementos do Vetor A */
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetorA[i] = scan.nextInt();
        }
        
        /* Vai igualar o vetor B ao vetor A */
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
        
        /* Vai imprimir o vetor A */
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        /* Vai imprimir o vetor B */
        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
    }
    
}
