package exerciciosaula17;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int maior = 0;
        int menor = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe a %dº idade: ", i+1);
            vetorA[i] = scan.nextInt();
            if(i == 0){
                maior = vetorA[i];
                menor = vetorA[i];
            } else {
                if(vetorA[i] > maior){
                    maior = vetorA[i];
                } else if(vetorA[i] < menor){
                    menor = vetorA[i];
                }
            }
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == maior){
                System.out.println("O maior número é: " + vetorA[i]+ ". E está na posição: " + i);
            } else if (vetorA[i] == menor){
                System.out.println("O menor número é: " + vetorA[i]+ ". E está na posição: " + i);
            }
        }

    }
    
}
