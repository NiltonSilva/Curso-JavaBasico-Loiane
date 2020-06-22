
package exerciciosaula17;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double [] nota1 = new double [10];
        double [] nota2 = new double [nota1.length];
        double [] result = new double [nota1.length];
        
        for(int i = 0; i < nota1.length; i++){
            System.out.printf("Informe a primeira nota do %dº aluno: ", i+1);
            nota1[i] = scan.nextDouble();
            System.out.printf("Informe a segunda nota do %dº aluno: ", i+1);
            nota2[i] = scan.nextDouble();
            result[i] = ((nota1[i] + nota2[i]) / 2);
        }
        
        for(int i = 0; i < nota1.length; i++){
            if(result[i] > 7){
                System.out.println("Média = " + result[i] + ". ALUNO APROVADO!");
            } else {
                System.out.println("Média " + result[i] + ". ALUNO REPROVADO!");
            }
        }
    }
    
}
