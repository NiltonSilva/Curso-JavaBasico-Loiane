package com.loiane.cursojava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
		void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado com suceso.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km);
	}
}