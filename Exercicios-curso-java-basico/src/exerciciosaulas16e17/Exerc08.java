package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int numero;
        for(int i = 0; i < 5; i++){
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numero = input.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + (soma / 5));
    }
    
}
