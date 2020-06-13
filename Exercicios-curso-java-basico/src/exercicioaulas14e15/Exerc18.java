package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("Número PAR");
        } else {
            System.out.println("Número ÍMPAR");
        }
    }
    
}
