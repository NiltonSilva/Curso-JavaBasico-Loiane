package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc26 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o numero do fatorial: ");
        int numero = input.nextInt();
        
        System.out.println("Fatorial de " + numero);
        System.out.print(numero + " ! = ");
        
        int fatorial = 1;
        for(int i = numero; i > 1; i--){
            fatorial *= i;
            System.out.print(i + " * ");
        }
        System.out.print(" 1 = " + fatorial);
        System.out.println("");
    }
    
}
