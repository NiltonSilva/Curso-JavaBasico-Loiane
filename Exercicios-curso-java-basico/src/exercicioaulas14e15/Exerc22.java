package exercicioaulas14e15;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc22 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //System.out.print("Qual fruta? ");
        //String fruta = input.next();
        System.out.print("Informe a quantidade de morangos: ");
        double pesoMorango = input.nextDouble();
        System.out.print("Informe a quantidadde de maçãs: ");
        double pesoMaca = input.nextDouble();
        
        double totalPeso = pesoMorango + pesoMaca;
        double precoMorango = 1;
        double precoMaca = 1;
        double precoTotal;
        
        if(pesoMorango <= 5){
            precoMorango = pesoMorango * 2.50;
        } else {
            precoMorango = pesoMorango * 2.20;
        }
        
        if(pesoMaca <= 5){
            precoMaca = pesoMaca * 1.80;
        } else {
            precoMaca = pesoMaca * 1.50;
        }
        
        precoTotal = precoMaca + precoMorango;
        
        if((pesoMorango + pesoMaca > 8) || (pesoMorango > 8) || (pesoMaca > 8) 
        || (precoMorango > 25) || (precoMaca > 25) || (precoMorango + precoMaca > 25)) {
            precoTotal = precoTotal - (precoTotal * 0.10);
        }
        System.out.println("O valor a ser pago pelo cliente é: " + NumberFormat.getCurrencyInstance().format(precoTotal));
    }
    
}
