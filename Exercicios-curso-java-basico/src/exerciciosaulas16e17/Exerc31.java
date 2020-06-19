package exerciciosaulas16e17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //System.out.print("Informe o salário inicial: ");
        // double salario = input.nextDouble();
        double salario = 1000;
        double percentual = 1.5;
        
        salario += (salario/100) * percentual;
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for(int i = 1997; i <= 2015; i++){
            percentual *= 2;
            salario += (salario/100) * percentual;
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
    
}
