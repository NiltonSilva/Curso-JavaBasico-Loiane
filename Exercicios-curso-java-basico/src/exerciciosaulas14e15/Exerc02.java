package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um ´numero: ");
        double valor = input.nextInt();
        
        if (valor > 0){
            System.out.println("O número digitado é POSITIVO");
        } else if (valor < 0) {
            System.out.println("O número digitado é NEGATIVO");
        }
        else {
            System.out.println("Você digitou um número neutro.");
        }
        input.close();
    }
    
}
