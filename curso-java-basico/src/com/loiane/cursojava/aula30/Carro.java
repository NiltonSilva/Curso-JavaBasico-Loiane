package com.loiane.cursojava.aula30;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo) {
		//this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 par�metros.");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 par�metros.");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado com suceso.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}
}