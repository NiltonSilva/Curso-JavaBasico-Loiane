/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaulas14e15;

import java.util.Scanner;

/**
 *
 * @author nsfge
 */
public class Exerc09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double priNum = input.nextDouble();
        System.out.print("Informe o segundo número: ");
        double segNum = input.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double terNum = input.nextDouble();
        
        if(priNum < segNum && priNum < terNum){
            if(segNum < terNum){
                System.out.println(terNum + " / " + segNum + " / " + priNum);
            } else {
                System.out.println(segNum + " / " + terNum + " / " + priNum);
            }
        } else if (segNum < priNum && segNum < terNum){
            if (priNum < terNum){
                System.out.println(terNum + " / " + priNum + " / "  + segNum);
            } else {
                System.out.println(priNum + " / " + terNum + " / "  + segNum);
            }
        } else if (terNum < priNum && terNum < segNum){
            if(priNum < segNum){
                System.out.println(segNum + " / " + priNum + " / "  + terNum);
            } else {
                System.out.println(priNum + " / " + segNum + " / "  + terNum);
            }
        }
        
        input.close();
    }
    
}
