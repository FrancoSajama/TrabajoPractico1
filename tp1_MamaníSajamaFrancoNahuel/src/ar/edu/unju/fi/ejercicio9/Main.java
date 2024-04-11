package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			Producto producto=new Producto();
			
			//carga de datos
			cargarDatos(producto, sc);
			
			//muestra de datos
			mostrarDatos(producto);
		}
		sc.close();
	}
	
	public static void cargarDatos(Producto producto, Scanner sc) {
		
		float descuento;
		
		System.out.println("\nIngrese nombre: ");
		producto.setNombre(sc.next());
		System.out.println("Ingrese codigo: ");
		producto.setCodigo(sc.next());
		System.out.println("Ingrese precio: ");
		producto.setPrecio(sc.nextFloat());
		do {
			System.out.println("Ingrese descuento entre (0,50): ");
			descuento=sc.nextFloat();
		}while(descuento>50 || descuento<0);
		producto.setDescuento(descuento);
	}
	
	public static void mostrarDatos(Producto producto) {
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Codigo: "+producto.getCodigo());
		System.out.println("Precio: "+producto.getPrecio());
		System.out.println("Descuento: "+producto.getDescuento());
		System.out.println("Precio con descuento: "+producto.calcularDescuento());
	}

}
