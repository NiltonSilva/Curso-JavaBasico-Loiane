package exerciciosaulas16e17;

public class Exerc04 {

    public static void main(String[] args) {
        
        double cidadeA = 80000;
        double cidadeB = 200000;
        int anos = 0;
        
        while(cidadeA < cidadeB){
            cidadeA = cidadeA * 1.03;
            cidadeB = cidadeB * 1.015;
            anos += 1;
        }
        System.out.printf("Daqui a %d anos a CIDADE A igualara ou passará a CIDADE B.\n", anos );
        System.out.printf("População A: %.0f\n", cidadeA);
        System.out.printf("População B: %.0f\n", cidadeB);
    }
    
}
