package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = input.nextInt();
        System.out.print("Informe o segundo número: ");
        double segundoNumero = input.nextInt();
        
        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número, " + primeiroNumero + ", é maior");
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O segundo número, " + segundoNumero + ", é o maior");
        } else {
            System.out.println("Os dois números têm o mesmo valor.");
        }
        input.close();
    }
    
}
