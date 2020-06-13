package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual combustível deseja [G/A]? ");
        char tipoCombustivel = input.next().charAt(0);
        System.out.print("Quantos litros deseja? ");
        double qtdadeLitros = input.nextDouble();
        
        double valorSemDesconto = 0;
        double valorComDesconto = 0;
        
        if(tipoCombustivel == 'g' || tipoCombustivel == 'G'){
            if(qtdadeLitros <= 20){
                valorSemDesconto = qtdadeLitros * 2.50;
                valorComDesconto = valorSemDesconto - (valorSemDesconto * 0.04);
            } else {
                valorSemDesconto = qtdadeLitros * 2.50;
                valorComDesconto = valorSemDesconto - (valorSemDesconto * 0.06);
            }           
        } else {
            if(qtdadeLitros <= 20){
                valorSemDesconto = qtdadeLitros * 1.90;
                valorComDesconto = valorSemDesconto - (valorSemDesconto * 0.03);
            } else {
                valorSemDesconto = qtdadeLitros * 1.90;
                valorComDesconto = valorSemDesconto - (valorSemDesconto * 0.05);
            } 
        }
        System.out.println("O valor a ser pago pelo cliente por " + qtdadeLitros + " litros de " + tipoCombustivel + " é: R$ "+ valorComDesconto);
        
    }
    
}
