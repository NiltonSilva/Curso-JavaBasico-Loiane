package exerciciosaula17;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int soma = 0;
        
        int[] vetorA = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];
        }
        
        System.out.println("A soma dos valores do vetor é: " + soma);
    }
    
}
