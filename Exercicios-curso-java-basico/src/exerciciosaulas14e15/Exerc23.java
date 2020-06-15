
package exerciciosaulas14e15;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe qual carne deseja ['F', 'A', 'P']: ");
        char tipoCarne = input.next().charAt(0);
        System.out.print("Informe a quantidade de carne: ");
        double qtdade = input.nextDouble();
        double preco = 1.0;
        double desconto = 1.0;
        double precoFinal = 1.0;
        System.out.print("Pagamento no cartão Tabajara [S/N]? ");
        char formaPagamento = input.next().charAt(0);
        
                
        if(tipoCarne == 'F' || tipoCarne == 'f'){
            if(qtdade <= 5){
                preco = 5.8 * qtdade;
            } else {
                preco = 4.9 * qtdade;
            }
        } else if (tipoCarne == 'A' || tipoCarne == 'a'){
            if(qtdade <= 5){
                preco = 6.8 * qtdade;
            } else {
                preco = 5.9 * qtdade;
            }
        }  else {
            if(qtdade <= 5){
                preco = 7.8 * qtdade;
            } else {
                preco = 6.9 * qtdade;
            }   
        }
        switch(tipoCarne){
            case 'f':
            case 'F':
                System.out.println("TIPO DE CARNE: File Duplo");
                break;
            case 'a':
            case 'A':
                System.out.println("TIPO DE CARNE: Alcatra");
                break;
            default:
                System.out.println("TIPO DE CARNE: Picanha");
                break;
        }
        
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.println("QUANTIDADE DE CARNE (KG): " + qtdade);
        System.out.println("PREÇO TOTAL: " + NumberFormat.getCurrencyInstance().format(preco));
        
        if(formaPagamento == 's' || formaPagamento == 'S'){
            desconto = preco * 0.05;
            precoFinal = preco - desconto;
            System.out.println("FORMA DE PAGAMENTO: Cartão Tabajara");
            System.out.println("VALOR DE DESCONTO: " + NumberFormat.getCurrencyInstance().format(desconto));
            System.out.println("VALOR FINAL A PAGAR: " + NumberFormat.getCurrencyInstance().format(precoFinal));
        } else {
            desconto = 0;
            precoFinal = preco;
            System.out.println("FORMA DE PAGAMENTO: Dinheiro ou outro cartão");
            System.out.println("VALOR DE DESCONTO: " + NumberFormat.getCurrencyInstance().format(desconto));
            System.out.println("VALOR FINAL A PAGAR: " + NumberFormat.getCurrencyInstance().format(precoFinal));
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("Supermercado Tabajara agradece pela preferência. Volte sempre!");
    }
}
