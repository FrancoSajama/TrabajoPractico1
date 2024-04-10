package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String legajo;
		float salario;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		nombre=sc.next();
		System.out.println("Ingrese legajo: ");
		legajo=sc.next();
		System.out.println("Ingrese salario: ");
		salario=sc.nextFloat();
		Empleado empleado=new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumentarSalario();
		empleado.mostrarDatos();
		sc.close();
	}

}
