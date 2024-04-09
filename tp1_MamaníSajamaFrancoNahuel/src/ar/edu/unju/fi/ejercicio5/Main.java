package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, aux, factorial=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese un numero del 1 al 9 para mostrar la tabla de multiplicacion correspondiente: ");
		num=sc.nextInt();
		
		if(num>=0 && num<=9) 
			for(int i=0; i<=9; i++) 
				System.out.print("\n"+num+" x "+i+" = "+num*i);
		else
			System.out.print("\nEl numero ingresado no esta en el rango especificado.");
	}

}
