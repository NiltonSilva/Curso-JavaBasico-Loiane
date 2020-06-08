package com.loiane.cursojava.aula19;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		double tempDia006 = 32.8;
		double tempDia007 = 30;
		double tempDia008 = 29.8;
		double tempDia009 = 31.5;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 �: " + temperaturas[0]);
		
		System.out.println("O tamanha do Array �: " + temperaturas.length);
		
		/*
		* System.out.println("Valores do Array: " + temperaturas);
		* Vai imprimir o endere�o de mem�ria da vari�vel TEMPERATURAS.
		*/
		
		/*
		* for(int i = 0;  i < temperaturas.length; i++) {
		*  	System.out.println("O valor da temperatura do dia " + i + " �: " + temperaturas[i]);
		* }
		*/
		
		for(double tem : temperaturas) {
			System.out.println(tem);
		}
		
	}

}
