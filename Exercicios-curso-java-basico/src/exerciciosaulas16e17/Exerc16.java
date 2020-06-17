
package exerciciosaulas16e17;

public class Exerc16 {

    public static void main(String[] args) {
        
        int primeiro = 1;
        int segundo = 1;
        int auxiliar = 0;
        
        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");
        
        while(auxiliar <= 500){
            auxiliar = primeiro + segundo;
            primeiro = segundo;
            segundo = auxiliar;
            System.out.print(auxiliar + " ");
        }
        
    }
    
}
