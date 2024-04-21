package ar.edu.unju.fi.ejercicio17.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion; 
	
	public Jugador() {
		
	}

	public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, Integer estatura,
			float peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	/**
	 * Se calcula la fecha obteniendo la diferencia de milisegundos entre
	 * la fecha actual y la del nacimiento
	 * Luego se tranforma de milisegundos a segundos/minutos/horas/dias/años
	 * @return
	 */
	public Integer calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		return (int)((fechaActual.getTimeInMillis() - this.fechaNacimiento.getTimeInMillis())/1000)/60/60/24/365;
	}
	
	public void mostrarDatos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("Fecha de nacimiento: "+sdf.format(this.fechaNacimiento.getTime()));
		System.out.println("Nacionalidad: "+this.nacionalidad);
		System.out.println("Estatura: "+this.estatura);
		System.out.println("Peso: "+this.peso);
		System.out.println("Posicion: "+this.posicion);
	}

}
