package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, aux, factorial=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese un numero del 1 al 10: ");
		num=sc.nextInt();
		
		if(num>=0 && num<=10) {
			if(num!=0) {
				aux=num;
				while(aux!=0) {
					factorial*=aux;
					aux--;
				}
			}
			System.out.println("El factorial de "+num+" es: "+factorial);
		}else 
			System.out.print("El numero ingresado no esta en el rango especificado.");
			
		sc.close();
	}

}
