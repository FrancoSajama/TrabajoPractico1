package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			Pizza pizza=new Pizza();
			
			//carga de datos
			cargarDatos(pizza, sc);
			pizza.calcularPrecio();
			pizza.calcularArea();
			//muestra de datos
			System.out.println("\n** Pizza "+i+" **");
			pizza.mostrarDatos();
		}
		sc.close();
	}

public static void cargarDatos(Pizza pizza, Scanner sc) {
		
		boolean ingredientesEspeciales;
		Integer diametro;
		
		do {
			System.out.println("\nIngrese diametro (20,30 o 40): ");
			diametro=sc.nextInt();
		}while(diametro!=20 && diametro!=30 && diametro!=40);
		pizza.setDiametro(diametro);
		do {
			System.out.println("Ingredientes especiales: ");
			ingredientesEspeciales=sc.nextBoolean();
		}while(ingredientesEspeciales==false && ingredientesEspeciales==true);
		pizza.setIngredientesEspeciales(ingredientesEspeciales);
	}
	
	
}
