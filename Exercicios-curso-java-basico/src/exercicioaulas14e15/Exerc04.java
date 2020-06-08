/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaulas14e15;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nsfge
 */
public class Exerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe uma letra: ");
        
        char letra = (char)System.in.read();
        
        if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || 
            letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U'){
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }
    }
    
}
