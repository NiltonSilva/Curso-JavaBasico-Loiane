
package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número limite: ");
        int numero = input.nextInt();
        boolean primo;

        for (int i = 1; i <= numero; i++) {
            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }

        }
    }
}
