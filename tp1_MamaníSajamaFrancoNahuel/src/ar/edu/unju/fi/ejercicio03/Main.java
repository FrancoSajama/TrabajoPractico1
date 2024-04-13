package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero=sc.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero "+numero+" es par."+" El nuevo numero es: "+numero*3);
		}else {
			System.out.println("El numero "+numero+" es impar."+" El nuevo numero es: "+numero*2);
		}
		sc.close();
	}

}
