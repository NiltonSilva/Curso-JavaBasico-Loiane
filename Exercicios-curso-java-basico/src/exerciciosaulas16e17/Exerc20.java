package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe quantas pessoas serao: ");
        int qtdade = input.nextInt();
        
        int soma = 0;
        double media = 0;
        for(int i = 1; i <= qtdade; i++){
            System.out.print("Informe a " + i + "º idade: ");
            int idade = input.nextInt();
            soma += idade;
        }
        media = soma / qtdade;
        if(media <= 25){
            System.out.print("A média da turma é: " + media + ". ");
            System.out.print("TURMA É JOVEM");
        } else if (media <= 60){
            System.out.print("A média da turma é: " + media + ". ");
            System.out.print("TURMA É ADULTA");
        } else {
            System.out.print("A média da turma é: " + media + ". ");
            System.out.print("TURMA É IDOSA");
        }
        System.out.println("");
    }
    
}
