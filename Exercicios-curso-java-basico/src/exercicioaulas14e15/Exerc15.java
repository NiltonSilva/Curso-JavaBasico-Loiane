
package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a primeira medida: ");
        double ladoA = input.nextDouble();
        System.out.print("Informe a segunda medida: ");
        double ladoB = input.nextDouble();
        System.out.print("Informe a terceira medida: ");
        double ladoC = input.nextDouble();
        
        if ((ladoA + ladoB) > ladoC && (ladoB + ladoC) > ladoA && (ladoA + ladoC) > ladoB){
            System.out.println("Os segmentos informados formam um triângulo.");
            if((ladoA == ladoB) && (ladoB == ladoC)){
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else if((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){
                System.out.println("TRIÂNGULO ISÓCELES");
            } else {
                System.out.println("TRIÂNGULO ESCALENO");
            } 
        } else {
            System.out.println("Os segmentos informados não formam um triângulo.");
        }
    }
    
}
