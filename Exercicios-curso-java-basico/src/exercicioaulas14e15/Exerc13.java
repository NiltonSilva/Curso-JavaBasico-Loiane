package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escolhe um número que corresponda aos dias da semana: ");
        int diaSemana = input.nextInt();
        
        switch(diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número de 1 a 7!");
                break;
        }
        
    }
    
}
