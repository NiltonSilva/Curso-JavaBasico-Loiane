package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Deseja saber a tabuada de qual número? ");
        int numero = input.nextInt();

        System.out.print("Deseja começar em: ");
        int comeco = input.nextInt();
        System.out.print("Deseja terminar em: ");
        int fim = input.nextInt();

        System.out.printf("Vou montar a tabuada de %d começando em %d e terminado em %d", numero, comeco, fim);
        System.out.println("");
        for(int i = comeco; i <= fim; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
