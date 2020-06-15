package exerciciosaulas16e17;

import com.sun.xml.internal.ws.util.StringUtils;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        
        System.out.print("Informe seu nome: ");
        do{
            nome = input.nextLine();
            if(nome.length() <= 3){
                System.out.println("O nome deve conter mais que 3 caracteres.");
                System.out.print("Por favor, informe seu nome corretamente: ");
            }
        } while(nome.length() <= 3);
        
        System.out.print("Informe sua idade: ");
        do{
            idade = input.nextInt();
            if(idade < 0 || idade > 150){
                System.out.println("Sua idade deve ser entre 0 e 150.");
                System.out.print("Por favor, informe a idade corretamente: ");
            }
        } while(idade < 0 || idade > 150);
        
        System.out.print("Informe seu salário: ");
        do{
            salario = input.nextDouble();
            if(salario <= 0){
                System.out.println("O salário deve ser maior que 0.");
                System.out.print("Por favor, informe o salário corretamente: ");
            }
        } while(salario <= 0);
        
        System.out.print("Informe seu sexo [F/M]: ");
        do{
            sexo = input.next().charAt(0);
            if(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M'){
                System.out.println("Sexo inválido.");
                System.out.print("Por favor, informe o sexo novamente: ");
            }
        } while(sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M');
        
        System.out.print("Informe seu estado civil [S, C, V, D]: ");
        do{
            estadoCivil = input.next().charAt(0);
            if(estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' && estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D'){
                System.out.println("Estado civil inválido.");
                System.out.print("Escolha uma das opções para seu estado civil [S, C, V, D]: ");
            }
        }while(estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' && estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D');
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.println("Nome: " + StringUtils.capitalize(nome));
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + NumberFormat.getCurrencyInstance().format(salario));
        if(Character.toUpperCase(sexo) == 'M'){
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }
        switch(Character.toUpperCase(estadoCivil)){
            case 'S':
                System.out.println("Estado civil: Solteiro(a)");
                break;
            case 'c':
                System.out.println("Estado civil: Casado(a)");
                break;
            case 'V':
                System.out.println("Estado civil: Viuvo(a)");
            case 'd':
                System.out.println("Estado civil: Divorciado(a)");
        }        
    }
}
