package exerciciosaula19;

import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        boolean impar = true;
        

        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor: ", (i+1));
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 != 0){
                break;
            }   
        }                      
    }  
}
