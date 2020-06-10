package exercicioaulas14e15;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o salário atual: R$ ");
        double salarioSemAjuste = input.nextDouble();
        
        double salarioComAjuste;
        double valorDoAjuste;
        
        if (salarioSemAjuste <= 280){
            salarioComAjuste = salarioSemAjuste * 1.2;
            System.out.printf("O salário do funcionário antes do ajuste era de %.2f", salarioSemAjuste);
            System.out.println("\nO salário foi reajustado em 20%.");
            valorDoAjuste = salarioSemAjuste * 0.2;
            System.out.printf("O valor do aumento foi: R$ %.2f.", valorDoAjuste);
            System.out.printf("\nO novo salário após o aumento ficou em:  R$ %.2f.", salarioComAjuste);
        } else if (salarioSemAjuste > 280 && salarioSemAjuste <= 700){
            salarioComAjuste = salarioSemAjuste * 1.15;
            System.out.printf("O salário do funcionário antes do ajuste era de %.2f", salarioSemAjuste);
            System.out.println("\nO salário foi reajustado em 15%.");
            valorDoAjuste = salarioSemAjuste * 0.15;
            System.out.printf("O valor do aumento foi: R$ %.2f.", valorDoAjuste);
            System.out.printf("\nO novo salário após o aumento ficou em:  R$ %.2f.", salarioComAjuste);
        } else if (salarioSemAjuste > 700 && salarioSemAjuste <= 1500) {
            salarioComAjuste = salarioSemAjuste * 1.1;
            System.out.printf("O salário do funcionário antes do ajuste era de %.2f", salarioSemAjuste);
            System.out.println("\nO salário foi reajustado em 10%.");
            valorDoAjuste = salarioSemAjuste * 0.1;
            System.out.printf("O valor do aumento foi: R$ %.2f.", valorDoAjuste);
            System.out.printf("\nO novo salário após o aumento ficou em:  R$ %.2f.", salarioComAjuste);
        } else {
            salarioComAjuste = salarioSemAjuste * 1.05;
            System.out.printf("O salário do funcionário antes do ajuste era de %.2f", salarioSemAjuste);
            System.out.println("\nO salário foi reajustado em 5%.");
            valorDoAjuste = salarioSemAjuste * 0.05;
            System.out.printf("O valor do aumento foi: R$ %.2f.", valorDoAjuste);
            System.out.printf("\nO novo salário após o aumento ficou em:  R$ %.2f.", salarioComAjuste);
        }
        System.out.println();
        System.out.println();
    }
    
}
