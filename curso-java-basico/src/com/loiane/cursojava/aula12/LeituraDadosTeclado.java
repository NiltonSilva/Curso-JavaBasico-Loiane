package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		scan.close();

	}

}
