package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {
        
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        
        int contador = 0;
        
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador += 1;
            }
        }
        if(contador == 2){
            System.out.println("O numero " + numero + " é primo.");
        } else {
            System.out.println("O numero " + numero + " não é primo.");
        }
        
    }
    
}
