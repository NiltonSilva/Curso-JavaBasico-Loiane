package com.loiane.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(1, 2));
		System.out.println(calc.soma(1.0, 2.0));
		System.out.println(calc.soma(1, 2, 3));
		System.out.println(calc.soma([5]));
	}

}
