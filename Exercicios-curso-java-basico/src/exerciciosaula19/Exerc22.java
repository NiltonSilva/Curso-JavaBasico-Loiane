package exerciciosaula19;

import java.util.Random;

public class Exerc22 {

    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        
        int contador0 = 0;
        int contador1 = 0;
        
        Random numeroAleatorio = new Random();
        
        for(int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = numeroAleatorio.nextInt(2);
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == 0){
                contador0 += 1;
            }
            else {
                contador1 += 1;
            }
        }
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]);
        }
        System.out.println();
        System.out.println("O percentual de 0's é: " + (contador0 * 100)/10 + "%");
        System.out.println("O percentual de 1's é: " + (contador1 * 100)/10 + "%");
    }
    
}
