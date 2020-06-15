package exerciciosaulas14e15;

import java.io.IOException;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma das opções [M/F]: ");
        char opcao = (char)System.in.read();
        
        if(opcao == 'M' || opcao == 'm') {
            System.out.println("Sexo Masculino");
        } else if (opcao == 'F' || opcao == 'f') {
            System.out.println("Sexo Feminino");
        } else {
            System.out.println("Opção inválida");
        }
        
    }
    
}
