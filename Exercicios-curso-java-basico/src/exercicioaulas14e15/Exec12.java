
package exercicioaulas14e15;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exec12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor de horas trabalhadas: ");
        int qtdadeHoras = input.nextInt();
        System.out.print("Informe o valor da hora/trabalho: R$ ");
        int valorHora = input.nextInt();
        
        int salarioBruto = qtdadeHoras * valorHora;
        double impostoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double inss = salarioBruto * 0.1;

        if(salarioBruto <= 900){
            double iR = 0;
            double totalDescontos =  inss + iR;
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println();
            System.out.print(String.format("%-40s", "Salário Bruto: (" + qtdadeHoras + " * " + valorHora + ")"));
            System.out.println(String.format("%11s", ": " + NumberFormat.getCurrencyInstance().format(salarioBruto)));
            System.out.print(String.format("%-40s", "( - ) IR (Isento)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(iR)));
            System.out.print(String.format("%-40s", "( - ) INSS (10%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(inss)));
            System.out.print(String.format("%-40s", "FTGS (11%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(fgts)));
            System.out.print(String.format("%-40s", "Total de descontos"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(totalDescontos)));
            System.out.print(String.format("%-40s", "Salário Líquido"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(salarioLiquido)));
        } else if (salarioBruto <= 1500 ){
            double iR = salarioBruto * 0.05;
            double totalDescontos =  inss + iR;
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println();
            System.out.print(String.format("%-40s", "Salário Bruto: (" + qtdadeHoras + " * " + valorHora + ")"));
            System.out.println(String.format("%11s", ": " + NumberFormat.getCurrencyInstance().format(salarioBruto)));
            System.out.print(String.format("%-40s", "( - ) IR (5%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(iR)));
            System.out.print(String.format("%-40s", "( - ) INSS (10%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(inss)));
            System.out.print(String.format("%-40s", "FTGS (11%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(fgts)));
            System.out.print(String.format("%-40s", "Total de descontos"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(totalDescontos)));
            System.out.print(String.format("%-40s", "Salário Líquido"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(salarioLiquido)));
        } else if (salarioBruto <= 2500) {
            double iR = salarioBruto * 0.1;
            double totalDescontos =  inss + iR;
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println();
            System.out.print(String.format("%-40s", "Salário Bruto: (" + qtdadeHoras + " * " + valorHora + ")"));
            System.out.println(String.format("%11s", ": " + NumberFormat.getCurrencyInstance().format(salarioBruto)));
            System.out.print(String.format("%-40s", "( - ) IR (10%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(iR)));
            System.out.print(String.format("%-40s", "( - ) INSS (10%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(inss)));
            System.out.print(String.format("%-40s", "FTGS (11%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(fgts)));
            System.out.print(String.format("%-40s", "Total de descontos"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(totalDescontos)));
            System.out.print(String.format("%-40s", "Salário Líquido"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(salarioLiquido)));
        } else {
            double iR = salarioBruto * 0.2;
            double totalDescontos =  inss + iR;
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println();
            System.out.print(String.format("%-40s", "Salário Bruto: (" + qtdadeHoras + " * " + valorHora + ")"));
            System.out.println(String.format("%11s", ": " + NumberFormat.getCurrencyInstance().format(salarioBruto)));
            System.out.print(String.format("%-40s", "( - ) IR (20%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(iR)));
            System.out.print(String.format("%-40s", "( - ) INSS (10%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(inss)));
            System.out.print(String.format("%-40s", "FTGS (11%)"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(fgts)));
            System.out.print(String.format("%-40s", "Total de descontos"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(totalDescontos)));
            System.out.print(String.format("%-40s", "Salário Líquido"));
            System.out.println(String.format("%-11s", ": " + NumberFormat.getCurrencyInstance().format(salarioLiquido)));
        }
        
    }
    
}
