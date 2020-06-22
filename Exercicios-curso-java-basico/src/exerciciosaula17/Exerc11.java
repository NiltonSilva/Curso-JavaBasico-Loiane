
package exerciciosaula17;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int totalPares = 0;
        
        int[] vetorA = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){
                totalPares += 1;
            }
        }
        System.out.println("O total de números pares informados foi: " + totalPares);
    }
    
}
