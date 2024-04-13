package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

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
