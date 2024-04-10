package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		calculadora.setN(sc.nextInt());
		
		System.out.println("Sumatoria: "+calculadora.calcularSumatoria());
		System.out.println("Productoria: "+calculadora.calcularProductoria());
		
		sc.close();
	}

}
