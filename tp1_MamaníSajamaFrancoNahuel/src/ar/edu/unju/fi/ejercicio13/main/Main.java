package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numerosEnteros = new Integer[8];
		
		for(int i = 0; i<=7; i++) {
			numerosEnteros[i] = obtenerNumeroEntero("Ingrese numero entero: ");
		}
		mostrarDatosArray(numerosEnteros);
	}
	
	/**Metodo para asegurarnos que lo que el usuario ingrese por consola sean solo numeros enteros
	 * 
	 * @param imprimirMensaje usamos para mostrar al usuario por consola
	 * @return una vez que el usuario ingresa un numero entero, el metodo termina
	 */
	public static Integer obtenerNumeroEntero(String imprimirMensaje) {
		while(true) {
			try {
				System.out.println(imprimirMensaje);
				return Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.err.println("Solo debe ingresar numeros enteros");
			}
		}
	}
	
	public static void mostrarDatosArray(Integer[] numerosEnteros){
		for(int i = 0; i <= numerosEnteros.length-1; i++)
			System.out.println("["+i+"] = "+ numerosEnteros[i]);
	}

}
