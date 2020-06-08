package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        double primeiraNota = input.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double segundaNota = input.nextDouble();
        
        double media = (primeiraNota + segundaNota) / 2;
        
        if(media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        input.close();
    }
    
}
