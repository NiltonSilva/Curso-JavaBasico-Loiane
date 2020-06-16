
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int par = 0;
        int impar = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.print("Informe o " + (i + 1) + "º numero: ");
            int num = input.nextInt();
            if(num % 2 == 0){
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);
    }
    
}
