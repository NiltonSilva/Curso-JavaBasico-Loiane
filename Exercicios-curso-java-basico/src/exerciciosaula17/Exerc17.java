package exerciciosaula17;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int totalMaiorQue35 = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe a %dº idade: ", i+1);
            vetorA[i] = scan.nextInt();
            if(vetorA[i] > 35){
                totalMaiorQue35 += 1;
            }
        }
        System.out.println("A quantidade de pessoas com idade superior a 35 é: " + totalMaiorQue35);
    }
    
}
