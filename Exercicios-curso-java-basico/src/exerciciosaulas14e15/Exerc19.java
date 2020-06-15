package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o 1º número: ");
        double num1 = input.nextInt();
        System.out.print("Informe o 2º número: ");
        double num2 = input.nextInt();
        System.out.print("Qual operação deseja realizar ['+', '-', '*' ou '/']? ");
        char operacao = input.next().charAt(0);
        
        double resultado;
        if(operacao == '+'){
            resultado = num1 + num2;
            System.out.println("O valor da operação é: " + resultado);
        } else if (operacao == '-'){
            resultado = num1 - num2;
            System.out.println("O valor da operação é: " + resultado);
        } else if (operacao == '*'){
            resultado = num1 * num2;
            System.out.println("O valor da operação é: " + resultado);
        } else {
            resultado = num1 / num2;
            System.out.println("O valor da operação é: " + resultado);
        }
        
        if(resultado % 2 == 0){
            System.out.println("Número PAR.");
        } else {
            System.out.println("Número ÍMPAR.");
        }
        
        
    }
    
}
