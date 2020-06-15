package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = input.nextDouble();
        
        double maiorNumero = primeiroNumero;
        
        System.out.print("Informe o segundo número: ");
        double segundoNumero = input.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double terceiroNumero = input.nextDouble();
        
        if ((segundoNumero > primeiroNumero) || (terceiroNumero > primeiroNumero)){
            if (terceiroNumero > segundoNumero){
                System.out.println("O terceiro número é o maior.");
            } else {
                System.out.println("O segundo número é maior.");
            }
        } else {
            System.out.println("O primeiro número é o maior.");
        }
        input.close();
    }
    
}
