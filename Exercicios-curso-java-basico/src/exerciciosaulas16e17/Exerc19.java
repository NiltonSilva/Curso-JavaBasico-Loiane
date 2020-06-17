package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe quantas notas vai inserir: ");
        int numero = input.nextInt();
        
        double nota;
        double soma = 0;
        double media = 0;
        
        for(int i = 0; i < numero; i++){
            System.out.print("Informe a " + (i+1) + "º nota: ");
            nota = input.nextDouble();
            soma = soma + nota;
        }
        media = soma / numero;
        System.out.println("A média do aluno é = " + media);
        
        
    }
    
}
