
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc27 {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        double temperatura;
        double maior = 0;
        double menor = 0;
        double soma = 0;
        double media;
        
        System.out.print("Informe a quantidade de temperaturas: ");
        int qtdTemperaturas = scan.nextInt();
        
        for(int i = 0; i < qtdTemperaturas; i++){
            System.out.print("Informe a " + (i + 1) + "º temperatura: ");
            temperatura = scan.nextDouble();
            soma += temperatura;
            if(i == 0){
                maior = temperatura;
                menor = temperatura;
            } else {
                if(temperatura > maior){
                    maior = temperatura;
                }
                if(temperatura < menor){
                    menor = temperatura;
                }
            }
        }
        media = soma / qtdTemperaturas;
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Média de temperaturas: " + media);
    }
}
