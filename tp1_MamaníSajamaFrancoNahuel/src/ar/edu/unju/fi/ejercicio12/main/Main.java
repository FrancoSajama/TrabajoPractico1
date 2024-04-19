package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.*;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		Calendar fechaNacimiento = Calendar.getInstance();
		int dia, mes, anio;
		
		System.out.println("Ingrese nombre: ");
		persona.setNombre(sc.next());
		sc.nextLine();		
		dia = obtenerNumeroEntero("Ingrese dia de nacimiento: ");
		mes = obtenerNumeroEntero("Ingrese mes de nacimiento: ");
		anio = obtenerNumeroEntero("Ingrese anio de nacimiento: ");
		fechaNacimiento.set(anio, mes-1, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.mostrarDatos();
		System.out.println("Edad: "+persona.calcularEdad());
		System.out.println("Signo del zodiaco: "+persona.obtenerSignoZodiaco());
		System.out.println("Estacion del año cuando nacio: "+persona.obtenerEstacion());
	}
	
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

}
