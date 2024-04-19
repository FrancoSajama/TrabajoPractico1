package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero;
		while(true) {
			numero = obtenerNumeroEntero("Ingrese numero entero (entre 3 y 10): ");
			if (numero>=3 && numero<=10)
				break;
			else
				System.err.println("El numero no está en el rango");
		}
		Integer[] numerosEnteros = cargarArrayConNumerosEnteros(numero);
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
				return Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e) {
				System.err.println("El numero no es entero");
			}
		}
	}
	
	/**
	 * Cargamos el arreglo con numeros enteros usando el tamaño que ingreso el usuario,
	 * verificando si los numeros ingresados son numeros enteros o no
	 * 
	 * @param tamanio es el numero para el tamaño que requiere el usuario
	 * @return
	 */
	public static Integer[] cargarArrayConNumerosEnteros(Integer tamanio) {
		Integer[] numerosEnteros = new Integer[tamanio];
		for(int i = 0; i <= numerosEnteros.length-1; i++)
			numerosEnteros[i] = obtenerNumeroEntero("Ingrese numero entero: ");
		return numerosEnteros;
	}
	
	public static void mostrarDatosArray(Integer[] numerosEnteros){
		for(int i = 0; i <= numerosEnteros.length-1; i++)
			System.out.println("["+i+"] = "+ numerosEnteros[i]);
	}

}
