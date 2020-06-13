package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int totalRespostas = 0;
        
        System.out.print("Telefonou para a vítima [S/N]? ");
        char resposta1 = input.next().charAt(0);
        if(resposta1 == 's' || resposta1 == 'S'){
            totalRespostas += 1;
        }
        System.out.print("Esteve no local do crime [S/N]? ");
        char resposta2 = input.next().charAt(0);
        if(resposta2 == 's' || resposta2 == 'S'){
            totalRespostas += 1;
        }
        System.out.print("Mora perto da vítima [S/N]? ");
        char resposta3 = input.next().charAt(0);
        if(resposta3 == 's' || resposta3 == 'S'){
            totalRespostas += 1;
        }
        System.out.print("Devia para a vítima [S/N]? ");
        char resposta4 = input.next().charAt(0);
        if(resposta4 == 's' || resposta4 == 'S'){
            totalRespostas += 1;
        }
        System.out.print("Já trabalhou com a vítima [S/N]? ");
        char resposta5 = input.next().charAt(0);
        if(resposta5 == 's' || resposta5 == 'S'){
            totalRespostas += 1;
        }
        if(totalRespostas == 5){
            System.out.println("ASSASSINO");
        } else if(totalRespostas == 3 || totalRespostas == 4){
            System.out.println("CÚMPLICE");
        } else if (totalRespostas == 2){
            System.out.println("SUSPEITO");
        } else {
            System.out.println("INOCENTE");
        }
    }
    
}
