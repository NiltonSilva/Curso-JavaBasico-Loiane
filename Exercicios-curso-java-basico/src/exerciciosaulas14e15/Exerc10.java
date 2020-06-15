package exerciciosaulas14e15;

import java.io.IOException;
import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escolha uma das opções de turno [M/T/N]: ");
        char opcao = (char)System.in.read();
        
        if(opcao == 'm' || opcao == 'M'){
            System.out.println("Bom dia!");
        } else if (opcao == 't' || opcao == 'T') {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        
        input.close();
    }
    
}
