
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int anos = 0;
        char resposta;
        
        do{
            System.out.print("Informe a população do país A: ");
            double paisA = input.nextDouble();
            System.out.print("Informe a taxa de crescimento pais A: ");
            double txCrescimentoA = input.nextDouble();
            System.out.print("Informe a população do país B: ");
            double paisB = input.nextDouble();
            System.out.print("Informe a taxa de crescimento pais B: ");
            double txCrescimentoB = input.nextDouble();
                      
            if(paisA > paisB){
                while(paisA > paisB){
                    paisA = paisA * txCrescimentoA;
                    paisB = paisB * txCrescimentoB;
                    anos += 1;
                }
            System.out.printf("O país B levará %d anos para alcançar o país A.", anos);
            } else {
                while(paisA < paisB){
                    paisA = paisA * txCrescimentoA;
                    paisB = paisB * txCrescimentoB;
                    anos += 1;
                }
            System.out.printf("O país A levará %d anos para alcançar o país B.", anos);
            }
            System.out.print("\nDeseja continuar as comparações [S/N]: ");
            resposta = input.next().charAt(0);
        } while(resposta == 's' || resposta == 'S');
        
    }
    
}
