package exerciciosaulas16e17;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um nome de usuário: ");
        String nomeUsuario = input.next();
        
        String senha;
        
        do{
            System.out.print("Informe uma senha: ");
            senha = input.next();
            if (nomeUsuario.equals(senha)){
                System.out.print("A senha não pode ser igual ao nome do usuário. Por favor, crie outra senha!");
            }
        } while (nomeUsuario.equals(senha));
    }
}
