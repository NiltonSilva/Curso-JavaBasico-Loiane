package exerciciosaula17;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        int totalPares = 0;
        int totalImpares = 0;
        double porcPar;
        double porcImpar;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Informe o %dº valor do vetor A: ", i+1);
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){
                totalPares += 1;
            } else {
                totalImpares += 1;
            }
        }
        porcImpar = (totalImpares * 100) / 10;
        porcPar = (totalPares * 100) / 10;
        System.out.printf("Percentual de números impares: %d", porcImpar);
        System.out.println();
        System.out.printf("Percentual de números impares: %d", porcPar);
        System.out.println();
    }
    
}
