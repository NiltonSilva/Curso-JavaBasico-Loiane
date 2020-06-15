package exerciciosaulas14e15;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double raiz1 = 0;
        double raiz2 = 0; 
        
        System.out.print("Entre com o valor de A: ");
        int a = input.nextInt();
        System.out.print("Entre com o valor de B: ");
        int b = input.nextInt();
        System.out.print("Entre com o valor de C: ");
        int c = input.nextInt();
        
        int delta = (b * b) - (4 * a * c);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        if (a == 0){
            System.out.println("VALOR DE A = 0.");
            System.out.println("A equação não será do 2º grau.");
        } else if (delta < 0){
                System.out.println("VALOR DE DELTA NEGATIVO.");
        } else if (delta == 0){
            System.out.println("VALOR DE DELTA = 0.");
            System.out.println("Sua equação possui apenas uma raíz real.");
            raiz1 = (Math.sqrt(delta) + -(b)) / 2 * a;
            System.out.println("O VALOR DA RAIZ = " + raiz1);
        } else {
            System.out.println("SUA EQUAÇÃO POSSUI DUAS RAÍZES REAIS.");
            raiz1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            raiz2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("VALOR DO DELTA = " + delta);
            System.out.println("RAIZ 1 = " + raiz1);
            System.out.println("RAIZ 2 = " + raiz2);
        }
        System.out.println("PROGRAMA ENCERRADO!");
    }  
}
