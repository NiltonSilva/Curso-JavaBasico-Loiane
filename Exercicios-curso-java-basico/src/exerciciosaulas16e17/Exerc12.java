
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe qual número dejesa saber a tabuada: ");
        int numero = input.nextInt();
        
        System.out.println("-=-=-=-=-=-=-=");
        
        System.out.printf("Tabuada de %d:", numero);
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("-=-=-=-=-=-=-=");
        System.out.println();
    }
    
}
