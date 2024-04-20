package ar.edu.unju.fi.ejercicio16.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombresPersonas = cargarArrayConNombres();
		mostrarDatos(nombresPersonas);
		System.out.println("Tamaño del array: "+nombresPersonas.length);
		eliminarPersonaDeArray(nombresPersonas);
		mostrarDatos(nombresPersonas);
	}
	
	/**
	 * Cargamos el arreglo con nombres de personas que ingresa el usuario
	 * 
	 * @return
	 */
	public static String[] cargarArrayConNombres() {
		String[] nombresPersonas = new String[5];
		for(int i = 0; i<nombresPersonas.length; i++) {
			System.out.println("Ingrese nombre: ");
			nombresPersonas[i] = scanner.next();
		}
		return nombresPersonas;
	}
	
	/**
	 * Muestra de datos usando un do while que empieza en 0 
	 * Se analiza si el elemento del array es null para no imprimir, esto sirve mas que nada
	 * para cuando el usuario elimine uno de los elementos
	 * 
	 * @param nombresPersonas es el array que contiene los nombres de las personas
	 */
	public static void mostrarDatos(String[] nombresPersonas) {
		int i = 0;
		while(i<nombresPersonas.length) {
			if(nombresPersonas[i] != null)
				System.out.println("["+i+"] = "+nombresPersonas[i]);
			i++;
		}
	}
	
	/**Metodo para asegurarnos que lo que el usuario ingrese por consola sea un byte
	 * 
	 * @param imprimirMensaje usamos para mostrar al usuario por consola
	 * @return una vez que el usuario ingresa un numero entero, el metodo termina
	 */
	public static byte obtenerByte(String imprimirMensaje) {
		byte opcion = 0;
		System.out.println(imprimirMensaje);
		do {
			try {
				opcion = scanner.nextByte();
				if(opcion>=0 && opcion<=4) return opcion;
				System.err.println("Error. El indice debe estar entre 0 y 4.");
			}catch(InputMismatchException e) {
				System.err.println("Error. Lo ingresado no es un byte.");
				scanner.nextLine();
			}
		}while(true);
	}
	
	/**Elimina una persona del array usando el parametro indice que ingresa el usuario
	 * primero se evalua si el indice ingresado es el ultimo del array
	 * Si es el ultimo se le asigna null y si no es el ultimo se desplaza los valores del array,
	 * eliminando el contenido que habia en el indice ingresado
	 * 
	 * @param nombresPersonas
	 */
	public static void eliminarPersonaDeArray(String[] nombresPersonas) {
		byte indice = obtenerByte("Ingrese el indice de la persona a eliminar (0,4): ");
		System.out.println("entrp");
		if(indice != nombresPersonas.length-1) {
			int i = indice;
			do {
				nombresPersonas[i]=nombresPersonas[i+1];
				i++;
			}while(i<nombresPersonas.length-1);
			nombresPersonas[i] = null;
		}else
			nombresPersonas[indice] = null;
	}

}
