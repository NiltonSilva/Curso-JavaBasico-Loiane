package exerciciosaula17;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int soma = 0;
        int contador = 0;
        double media;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 2 == 1){
                contador+= 1;
                soma += vetorA[i];
            }
        }
        
        if(contador > 0)
        {
            media = soma / contador;
            System.out.println("A média aritmética simples dos valores ímpares é: " + media);
        } else {
            System.out.println("Nenhum número ímpar foi informado.");
        }
               
    }
    
}
