package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int anio, mes, dia;
		String dni, nombre, provincia;
		LocalDate fechaNacimiento;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese DNI: ");
		dni=sc.next();
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese año de nacimiento: ");
		anio=sc.nextInt();
		System.out.println("Ingrese mes de nacimiento: ");
		mes=sc.nextInt();
		System.out.println("Ingrese dia de nacimiento: ");
		dia=sc.nextInt();
		fechaNacimiento=LocalDate.of(anio, mes, dia);
		System.out.println("Ingrese provincia: ");
		provincia=sc.next();
		
		do {
			System.out.println("\n0. Salir");
			System.out.println("1. Usar constructor por defecto");
			System.out.println("2. Usar constructor parametrizado");
			System.out.println("3. Usar constructor con parametros especificos");
			op=sc.nextInt();
			switch(op) {
				case 1: 
					constructorPorDefecto(dni, nombre, fechaNacimiento, provincia);
					break;
				case 2:
					constructorParametrizado(dni, nombre, fechaNacimiento, provincia);
					break;
				case 3:
					constructorParametrosEspecificos(dni, nombre, fechaNacimiento);
					break;
				default:
			}
			
			
		} while(op!=0);
		sc.close();
	}
	
	public static void constructorPorDefecto(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		Persona persona=new Persona();
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);
		persona.mostrarDatos();
	}
	
	public static void constructorParametrizado(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		Persona persona=new Persona(dni, nombre, fechaNacimiento, provincia);
		persona.mostrarDatos();
	}

	public static void constructorParametrosEspecificos(String dni, String nombre, LocalDate fechaNacimiento) {
		Persona persona=new Persona(dni, nombre, fechaNacimiento);
		persona.mostrarDatos();
	}
	
}
