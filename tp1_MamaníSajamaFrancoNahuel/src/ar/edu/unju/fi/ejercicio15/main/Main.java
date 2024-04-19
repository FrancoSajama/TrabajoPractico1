package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero;
		while(true) {
			numero = obtenerNumeroEntero("Ingrese numero entero (entre 5 y 10): ");
			if (numero>=5 && numero<=10)
				break;
			else
				System.err.println("El numero no está en el rango");
		}
		String[] nombresPersonas = cargarNombresPersonas(numero);
		mostrarDatosArray(nombresPersonas);
		mostrarDatosArrayAlReves(nombresPersonas);
	}
	
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
	 * Cargamos el arreglo con nombres de personas que igresa el usuario
	 * 
	 * @param numero es el numero para el tamaño que requiere el usuario
	 * @return
	 */
	public static String[] cargarNombresPersonas(Integer numero) {
		String[] nombresPersonas = new String[numero];
		for(int i = 0; i <= nombresPersonas.length - 1; i++) {
			System.out.println("Ingrese nombre de persona: ");
			nombresPersonas[i] = scanner.nextLine();
		}
		return nombresPersonas;
	}
	
	/**
	 * Muestra de datos usando un for que empieza en 0 
	 * @param nombresPersonas es el array que contiene los nombres de las personas
	 */
	public static void mostrarDatosArray(String[] nombresPersonas){
		System.out.println("-------------------------");
		System.out.println("Muestra de datos normal");
		for(int i = 0; i <= nombresPersonas.length-1; i++)
			System.out.println("["+i+"] = "+ nombresPersonas[i]);
	}
	
	/**
	 * Muestra de datos usando un for que empieza en el tamaño que ingreso el usuario 
	 * y termina en 0. Al reves
	 * 
	 * @param nombresPersonas es el array que contiene los nombres de las personas
	 */
	public static void mostrarDatosArrayAlReves(String[] nombresPersonas){
		System.out.println("-------------------------");
		System.out.println("Muestra de datos al reves");
		for(int i = nombresPersonas.length-1; i >= 0; i--)
			System.out.println("["+i+"] = "+ nombresPersonas[i]);
	}

}
