
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;
        
        do {
            System.out.print("Deseja informar uma nova compra [S/N]? ");
            continuarCompra = scan.next();
            if(continuarCompra.equals("S")){
                
               output = "Lojas tabajaras\n";
               
               System.out.print("Digite a quantidade de produtos: ");
               qtdProdutos = scan.nextInt();
               
               total = 0;
               
               for(int i = 1; i <= qtdProdutos; i++){
                   System.out.printf("Informe o preço do produto %d: ", i);
                   preco = scan.nextDouble();
                   total += preco;
                   output += "Produto " + i + ": R$ " + preco +"\n";
               }
               output += "Total: R$ " + total;
               
               System.out.println("Total: R$ " + total);
               System.out.print("Entre com o valor pago: ");
               valorPago = scan.nextDouble();
               output += "\nDinheiro: R$ " + valorPago + "\n";
               troco = valorPago - total;
               output += "troco: R$ " + troco;
               System.out.println(output);
            } else {
                sair = true;
            }
        } while (!sair);  
    }
}
