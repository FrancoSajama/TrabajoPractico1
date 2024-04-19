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
		while(true) {
			try {
				System.out.println("Ingrese dia de nacimiento: ");
				dia = sc.nextInt();
				break;
			}catch (NumberFormatException InputMismatchException){
				System.out.println("Error");
			}
		}
		while(true) {
			try {
				System.out.println("Ingrese mes de nacimiento: ");
				mes = sc.nextInt();
				break;
			}catch (NumberFormatException e) {
				
			}
		}
		while(true) {
			try {
				System.out.println("Ingrese año de nacimiento: ");
				anio = sc.nextInt();
				break;
			}catch(NumberFormatException e) {
				
			}
		}
		fechaNacimiento.set(anio, mes-1, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.mostrarDatos();
		System.out.println("Edad: "+persona.calcularEdad());
		System.out.println("Signo del zodiaco: "+persona.obtenerSignoZodiaco());
		System.out.println("Estacion del año cuando nacio: "+persona.obtenerEstacion());
	}

}
