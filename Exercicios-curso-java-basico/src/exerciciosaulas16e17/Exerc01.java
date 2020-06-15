package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota = 0;
        
        do {
           System.out.print("Informe uma nota entre 0 e 10: ");
           nota = input.nextDouble();
           if (nota < 0 || nota > 10){
               System.out.println("Nota inválida. Por favor, informe uma nota entre 0 e 10.");
           }
        } while (nota < 0 || nota > 10);
        
    }
    
}
