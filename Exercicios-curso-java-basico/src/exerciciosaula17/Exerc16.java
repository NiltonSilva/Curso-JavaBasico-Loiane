package exerciciosaula17;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int somaMenorQue15 = 0;
        int qtdIgual15 = 0;
        int somaMaiorQue15 = 0;
        int contador = 0;
        double media;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
            if(vetorA[i] < 15){
                somaMenorQue15 += vetorA[i];
            } else if (vetorA[i] == 15){
                qtdIgual15 += 1;
            } else {
                somaMaiorQue15 += vetorA[i];
                contador += 1;
            }
        }
        media = somaMaiorQue15 / contador;
        System.out.println("A soma dos elementos que são menor que 15 é: " + somaMenorQue15);
        System.out.println("A quantidade de elementos que são iguais a 15 é: " + qtdIgual15);
        System.out.println("A média dos elementos que são maiores que 15 é: " + media);
    }
    
}
