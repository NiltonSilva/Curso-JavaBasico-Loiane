
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int priNum = input.nextInt();
        System.out.print("Informe o segundo número: ");
        int segNum = input.nextInt();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        for(int i = priNum; i <= segNum; i++){
            if(i ==  segNum){
                System.out.println(i + ".");
            } else {
                System.out.print(i + " - ");
            }
        }
        
    }
    
}
