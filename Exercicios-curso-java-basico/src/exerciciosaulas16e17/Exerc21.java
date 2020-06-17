package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de turmas: ");
        int qtdadeTurmas = input.nextInt();
        
        int qtdadeAlunos = 0;
        int soma = 0;
        double media = 0;
        
        for(int i = 0; i < qtdadeTurmas; i++){
            do{
                System.out.print("Informe quantos alunos tem na " + (i+1)+ "º turma: ");
                qtdadeAlunos = input.nextInt();
                if(qtdadeAlunos > 40){
                    System.out.println("-=-=-=-=-=-=-=-= ATENÇÃO -=-=-=-=-=-=-=-=");
                    System.out.println("A turma não pode ter mais que 40 alunos.");
                    System.out.println("-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=");
                }
            } while(qtdadeAlunos > 40);
            soma += qtdadeAlunos;
        }
        media = soma / qtdadeTurmas;
            
        System.out.println("A quantidade total de alunos é: " + soma);
        System.out.println("A quantidade de turmas é: " + qtdadeTurmas);
        System.out.println("A média de alunos por turma é: " + media);
    }
    
}
