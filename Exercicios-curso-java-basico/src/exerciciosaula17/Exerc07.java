package exerciciosaula17;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor B: ", i+1);
            vetorB[i] = scan.nextInt();
        }
        
        for(int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
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
        
        System.out.print("Vetor C = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
    
}