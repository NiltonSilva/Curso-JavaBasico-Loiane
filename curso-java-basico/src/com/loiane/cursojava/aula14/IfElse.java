package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("� maior de idade.");
		} else {
			System.out.println("N�o � maior de idade.");
		}
		*/
		
		// barato < 10
		// 10 < item < 15 - perdir desconto
		// 15 <= item < 17 - pesquisar mais
		// >= 17 - muito caro
		
		System.out.print("Entre com um valor: ");
		double valor = scan.nextDouble();
		if (valor <= 10) {
			System.out.println("Pode comprar! Est� barato.");
		} else if (valor > 10  && valor < 15) {
			System.out.println("Voc� pode pedir um desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais, pois est� a cima do pre�o normal");
		} else {
			System.out.println("Corre dai que est� muito caro!!!");
		}
		
		scan.close();

	}

}
