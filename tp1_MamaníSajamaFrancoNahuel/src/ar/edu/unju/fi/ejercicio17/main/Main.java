package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		List<Jugador> jugadores = new ArrayList<>();
		
		do{
			mostrarMenu();
			opcion = obtenerNumeroEntero("Elija una opcion: ");
			switch (opcion) {
			case 1: altaJugador(jugadores); break;
			case 2: mostrarDatosDeJugadorEspecifico(jugadores); break;
			case 3: mostrarJugadoresOrdenados(jugadores); break;
			case 4: modificarDatosJugador(jugadores); break;
			case 5: eliminarJugador(jugadores); break;
			case 6: mostrarCantidadJugadores(jugadores); break;
			case 7: mostrarCantidadJugadoresPorNacionalidad(jugadores); break; 
			case 8: System.out.println("PROGRAMA FINALIZADO"); break;
			default:
				System.err.println("Error. Opcion incorrecta.");
			}
		}while(opcion!=8);
	}
	
	/**
	 * Muestra la cantidad de que son de una nacionalidad especifica. Primero nos aseguramos
	 * que la lista no esta vacia y luego usamos el iterator para eliminar cuando el nombre y apellido
	 * coinciden con el buscado
	 * 
	 * @param jugadores 
	 */
	public static void mostrarCantidadJugadoresPorNacionalidad(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("MOSTRAR CANTIDAD DE JUGADORES POR NACIONALIDAD\n");
			String nacionalidad = obtenerString("Ingrese nacionalidad a buscar: ");
			int sumador=0;
			for(Jugador jugador: jugadores) {
				if(jugador.getNacionalidad().equals(nacionalidad)) {
					sumador++;
				}
			}
			System.out.println("La cantidad de jugadores con nacionalidad "+nacionalidad+" es: "+sumador);
		}
	}
	
	/**
	 * Metodo que se encarga de fijarse el tamaño del arrayList e imprime su valor para mostrar
	 * la cantidad de jugadores que hay en el arrayList
	 * 
	 * @param jugadores
	 */
	public static void mostrarCantidadJugadores(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("CANTIDAD DE JUGADORES\n");
			System.out.println("La cantidad total de jugadores es: "+jugadores.size()+"");
		}
	}
	
	/**
	 * Para eliminar un jugador primero nos fijamos si la lista esta vacia. Luego usamos un iterator para 
	 * eliminar el jugador buscado por nombre y apellido
	 * 
	 * @param jugadores arrayList del cual se eliminara el jugador
	 * @return
	 */
	public static boolean eliminarJugador(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			Iterator<Jugador> iterator = jugadores.iterator();
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("ELIMINAR JUGADOR\n");
			String nombre = obtenerString("Ingrese nombre a buscar: ");
			String apellido = obtenerString("Ingrese apellido a buscar: ");
			while(iterator.hasNext()) {
				Jugador j = iterator.next();
				if(j.getApellido().equals(apellido) && j.getNombre().equals(nombre)) {
					iterator.remove();
					System.out.println("Jugador eliminado con exito");
					return true;
				}
			}
			System.out.println("No se encontró el jugador.");
		}
		return false;
	}
	
	/**
	 * Para modificar los datos de un jugador primero nos fijamos si la lista esta vacia. Luego
	 * buscamos el jugador a modificar. Usamos la funcion para ingresar datos, que nos devuelve
	 * un objeto Jugador. Finalmente eliminamos el jugador con los datos anteriores e insertamos en ese lugar
	 * el nuevo jugador modificado
	 * 
	 * @param jugadores es el array del cual se modificara el jugador
	 * @return
	 */
	public static boolean modificarDatosJugador(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("MODIFICACION DE DATOS\n");
			String nombre = obtenerString("Ingrese nombre a buscar: ");
			String apellido = obtenerString("Ingrese apellido a buscar: ");
			for(int i = 0; i<jugadores.size(); i++) {
				if(jugadores.get(i).getApellido().equals(apellido) && jugadores.get(i).getNombre().equals(nombre)) {
					jugadores.remove(i);
					jugadores.add(i, ingresoDeDatosJugador());
					System.out.println("Se modificaron los datos del jugador.");
					return true;
				}
			}
			System.out.println("No se encontró el jugador.");
		}
		return false;
	}
	
	/**
	 * En este metodo nos aseguramos que no este la lista vacia. Luego buscamos e imprimimos 
	 * los datos de los jugadores que cumplan con la nacionalidad buscada por el usuario.
	 * 
	 * @param jugadores
	 */
	public static void mostrarDatosDeJugadorEspecifico(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("MOSTRAR DATOS DE JUGADOR ESPECIFICO\n");
			String nombre = obtenerString("Ingrese nombre a buscar: ");
			String apellido = obtenerString("Ingrese apellido a buscar: ");
			for(Jugador jugador: jugadores) {
				if(jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
					jugador.mostrarDatos();
					break;
				}
			}
		}
	}
	
	/**
	 * Opciones del menu principal
	 */
	public static void mostrarMenu(){
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("MENU PRINCIPAL\n");
		System.out.println("1 – Alta de jugador");
		System.out.println("2 – Mostrar los datos del jugador");
		System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
		System.out.println("4 – Modificar los datos de un jugador");
		System.out.println("5 – Eliminar un jugador");
		System.out.println("6 – Mostrar la cantidad total de jugadores que tiene el ArrayList.");
		System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		System.out.println("8 – Salir.");
	}
	
	
	/**Metodo para asegurarnos que lo que el usuario ingrese por consola sean solo numeros enteros
	 * 
	 * @param imprimirMensaje usamos para mostrar al usuario por consola
	 * @return una vez que el usuario ingresa un numero entero, el metodo termina
	 */
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
	 * Damos de alta un jugador usando la funcion add que incluye en el arrayList
	 * 
	 * @param jugadores
	 */
	public static void altaJugador(List<Jugador> jugadores) {
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("ALTA DE JUGADOR\n");
		jugadores.add(ingresoDeDatosJugador());
	}
	
	/**
	 * Metodo usado para solicitar todos los datos del jugador
	 * 
	 * @return devuelve un objeto Jugador
	 */
	public static Jugador ingresoDeDatosJugador() {
		Jugador jugador = new Jugador();
		jugador.setNombre(obtenerString("Ingrese nombre: "));
		jugador.setApellido(obtenerString("Ingrese apellido: "));
		jugador.setFechaNacimiento(obtenerfechaNacimiento());
		jugador.setNacionalidad(obtenerString("Ingrese nacionalidad: "));
		jugador.setEstatura(obtenerFloat("Ingrese estatura en metros: "));
		jugador.setPeso(obtenerFloat("Ingrese peso en Kg: "));
		jugador.setPosicion(obtenerPosicion());
		return jugador;
	}
	
	/**
	 * Para este procedimiento usamos Calendar y solicitamos al usuario que ingrese  dato por dato para
	 * luego usar el metodo set para guardar los datos ingresados
	 * 
	 * @return
	 */
	public static Calendar obtenerfechaNacimiento() {
		Calendar fechaNacimiento = Calendar.getInstance();
		Integer dia = obtenerNumeroEntero("Ingrese dia de nacimiento: ");
		Integer mes = obtenerNumeroEntero("Ingrese mes de nacimiento: ");
		Integer anio = obtenerNumeroEntero("Ingrese anio de nacimiento: ");
		fechaNacimiento.set(anio, mes-1, dia);
		return fechaNacimiento;
	}
	
	/**
	 * Metodo usado para solicitar un dato de tipo cadena y que el dato no este vacio
	 * 
	 * @param imprimirMensaje
	 * @return
	 */
	public static String obtenerString(String imprimirMensaje) {
		String string;
		while(true) {
			System.out.println(imprimirMensaje);
			string = scanner.nextLine();
			if(!string.equals("")) return string; else System.err.println("Error. No ingreso nada.");
		}
	}
	
	/**
	 * Metodo usado para obtener la posicion del jugador dando 4 opciones al usuario
	 * el cual solo debe elegir la opcion que desee
	 * @return
	 */
	public static String obtenerPosicion() {
		int opcion;
		while(true){
			System.out.println("¿Cual es la posicion del jugador?");
			System.out.println("1 - Delantero");
			System.out.println("2 - Medio");
			System.out.println("3 - Defensa");
			System.out.println("4 - Arquero");
			opcion = obtenerNumeroEntero("Elija una opcion: ");
			switch(opcion) {
			case 1: return "Delantero";
			case 2: return "Medio";
			case 3: return "Defensa";
			case 4: return "Arquero";
			default:System.err.println("Opcion invalida.");
			}
		}
	}
	
	/**
	 * Metodo que se encarga de asegurarse que lo introducido por consola sea un numero float
	 * y asi evitar que se ingrese otro caracter que no sea numerico
	 * 
	 * @param imprimirMensaje contiene el mensaje que se desea mostrar al usuario al solicitar
	 * que ingrese informacion de tipo float
	 * @return
	 */
	public static Float obtenerFloat(String imprimirMensaje) {
		while(true) {
			try {
				System.out.println(imprimirMensaje);
				return Float.parseFloat(scanner.nextLine());
			}catch(NumberFormatException e) {
				System.err.println("No es un numero.");
			}
		}
	}
	
	/**
	 * Este metodo solo se encarga de ordenar la lista por apellido y mostrrar los datos
	 * mediante el metodo mostrarJugaodres()
	 * @param jugadores
	 */
	public static void mostrarJugadoresOrdenados(List<Jugador> jugadores) {
		if(jugadores.isEmpty())
			System.out.println("La lista está vacia.");
		else {
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			System.out.println("\n----------------------------------------------------------------------");
			System.out.println("JUGADORES ORDENADOS");
			mostrarJugadores(jugadores);
			//jugadores.forEach(t->t.mostrarDatos());
		}
	}
	
	/**
	 * Este metodo usa un foreach para mostrar los datos de los jugadores usando un procedimiento
	 * de la propia clase Jugador
	 * @param jugadores
	 */
	public static void mostrarJugadores(List<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			for(Jugador jugador: jugadores) {
				System.out.println("\n----------------------------------------------------------------------");
				jugador.mostrarDatos();
			}
		}
	}
	
}
