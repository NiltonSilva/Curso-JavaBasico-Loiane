
package exerciciosaulas16e17;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos CDs vai comprar? ");
        int qtdadeCd = input.nextInt();
        
        double preco = 0;
        double soma = 0;
        double media = 0;
        
        for(int i = 0; i < qtdadeCd; i++){
            System.out.print("Informe o preço do " + (i+1) + "º CD: ");
            preco = input.nextDouble();
            soma += preco;
        }
        media = soma / qtdadeCd;
        System.out.println("O valor total gasto com CDs foi " + NumberFormat.getCurrencyInstance().format(soma));
        System.out.println("O valor médio de cada CD é " + NumberFormat.getCurrencyInstance().format(media));
    }
    
}
