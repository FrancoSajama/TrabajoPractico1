package ar.edu.unju.fi.ejercicio13.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numerosEnteros = new Integer[8];
		Scanner sc = new Scanner(System.in);
		int numero;
		
		for(int i = 0; i<=7; i++) {
			while(true) {
				System.out.println("Ingrese numero entero: ");
				try {
					numero = sc.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.out.println("Solo debe ingresar numeros enteros");
					sc.nextLine();
				}
			}
			numerosEnteros[i] = numero;
		}
		sc.close();
		mostrarDatosArray(numerosEnteros);
	}
	
	public static void mostrarDatosArray(Integer[] numerosEnteros){
		for(int i = 0; i <= numerosEnteros.length-1; i++)
			System.out.println("["+i+"] = "+ numerosEnteros[i]);
	}

}
