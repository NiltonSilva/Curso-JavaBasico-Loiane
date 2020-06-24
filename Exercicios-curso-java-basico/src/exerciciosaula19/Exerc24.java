package exerciciosaula19;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for(int i = 0; i <  vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor: ", (i+1));
            vetorA[i] = scan.nextInt();
        }
        boolean palindromo = true;
        for(int i = 0; i < (vetorA.length / 2); i++){
            if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        if(palindromo){
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
    
}
