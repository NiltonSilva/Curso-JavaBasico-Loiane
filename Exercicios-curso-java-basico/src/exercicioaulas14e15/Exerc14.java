
package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a 1º nota: ");
        double priNota = input.nextDouble();
        System.out.print("Informe a 2º nota: ");
        double segNota = input.nextDouble();
        
        double media = (priNota + segNota) / 2;
        
        if(media < 4){
            System.out.println("PRIMEIRA NOTA: " + priNota);
            System.out.println("SEGUNDA NOTA: " + segNota);
            System.out.println("MÉDIA: " + media + " - CONCEITO E");
            System.out.println("ALUNO REPROVADO");
        } else if (media < 6 ) {
            System.out.println("PRIMEIRA NOTA: " + priNota);
            System.out.println("SEGUNDA NOTA: " + segNota);
            System.out.println("MÉDIA: " + media + " - CONCEITO D");
            System.out.println("ALUNO REPROVADO");
        } else if (media <= 7.5 ) {
            System.out.println("PRIMEIRA NOTA: " + priNota);
            System.out.println("SEGUNDA NOTA: " + segNota);
            System.out.println("MÉDIA: " + media + " - CONCEITO C");
            System.out.println("ALUNO APROVADO");
        } else if (media <= 9 ) {
            System.out.println("PRIMEIRA NOTA: " + priNota);
            System.out.println("SEGUNDA NOTA: " + segNota);
            System.out.println("MÉDIA: " + media + " - CONCEITO B");
            System.out.println("ALUNO APROVADO");
        } else {
            System.out.println("PRIMEIRA NOTA: " + priNota);
            System.out.println("SEGUNDA NOTA: " + segNota);
            System.out.println("MÉDIA: " + media + " - CONCEITO A");
            System.out.println("ALUNO APROVADO");
        }
    }
    
}
