package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;

public class Persona {
	
	//Atributos
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	
	public Persona() {
		
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public Integer calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad=fechaActual.getYear()-fechaNacimiento.getYear();
		
		if(fechaNacimiento.getDayOfYear()>=fechaActual.getDayOfYear())
			edad++;
		
		return edad;
	}
	
	public boolean esMayor() {
		return this.calcularEdad()>=18;
	}
	
	public void mostrarDatos() {
		System.out.println("\nDNI: "+this.dni);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
		if(this.esMayor())
			System.out.println("La persona es mayor de edad.");
		else
			System.out.println("La persona no es mayor de edad.");
		System.out.println("Provincia: "+this.provincia);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", provincia="
				+ provincia + "]";
	}
	
	
}