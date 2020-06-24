package exerciciosaula19;

public class Exerc20 {

    public static void main(String[] args) {
        
        double[] vetorA = new double[20];
        double dolar = 5.37;
        
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (i+1) * dolar;
        }
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
    }
    
}
