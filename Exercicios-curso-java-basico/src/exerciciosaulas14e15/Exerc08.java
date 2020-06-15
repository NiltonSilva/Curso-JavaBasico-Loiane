package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: R$ ");
        double primeiroValor = input.nextDouble();
        
        double menorValor = primeiroValor;
        
        System.out.println("Informe o segundo valor: R$ ");
        double segundoValor = input.nextDouble();
        System.out.println("Informe o terceiro valor: R$ ");
        double terceiroValor = input.nextDouble();
        
        if(primeiroValor <= segundoValor && primeiroValor <= terceiroValor){
            System.out.println("Compre o produto 1.");
        } else if (segundoValor <= primeiroValor && segundoValor <= terceiroValor) {
            System.out.println("Compre o produto 2.");
        } else if (terceiroValor <= primeiroValor && terceiroValor <= segundoValor){
            System.out.println("Compre o produto 3.");
        }
        
        input.close();
    }
    
}
