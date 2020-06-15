package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = input.nextDouble();
        
        double maiorNumero = primeiroNumero;
        double menorNumero = primeiroNumero;
        
        System.out.print("Informe o segundo número: ");
        double segundoNumero = input.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double terceiroNumero = input.nextDouble();
        
        if((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)){
            if(segundoNumero > terceiroNumero){
                System.out.println("O primeiro número é maior.");
                System.out.println("O terceiro número é menor.");
            } else if (segundoNumero < terceiroNumero){
                System.out.println("O primeiro número é maior.");
                System.out.println("O segundo número é menor.");
            }
        } else if ((segundoNumero > primeiroNumero) && (segundoNumero > terceiroNumero)){
            if(primeiroNumero > terceiroNumero){
                System.out.println("O segundo número é maior.");
                System.out.println("O terceiro número é menor.");
            } else if (primeiroNumero < terceiroNumero){
                System.out.println("O segundo número é maior.");
                System.out.println("O primeiro número é menor.");
            }
        } else {
            if(primeiroNumero > segundoNumero){
                System.out.println("O terceiro número é maior");
                System.out.println("O segundo número é menor.");
            } else if (primeiroNumero < segundoNumero) {
                System.out.println("O terceiro número é maior");
                System.out.println("O primeiro número é menor.");
            }
        }
        input.close();
    }
    
}
