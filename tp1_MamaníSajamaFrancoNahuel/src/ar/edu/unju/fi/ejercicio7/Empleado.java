package ar.edu.unju.fi.ejercicio7;

public class Empleado {

	private String nombre;
	private String legajo;
	private float salario;
	private final float SALARIO_MINIMO=210000.00f;
	private final float AUMENTO_POR_MERITOS=20000.00f;
	
	public Empleado() {
	}

	public Empleado(String nombre, String legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario=salario>=this.SALARIO_MINIMO?salario:this.SALARIO_MINIMO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public float getAUMENTO_POR_MERITOS() {
		return AUMENTO_POR_MERITOS;
	}
	
	public void mostrarDatos() {
		System.out.println("\nNombre del empleado: J"+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario $: "+this.salario);
	}
	
	public void aumentarSalario() {
		this.salario+=this.AUMENTO_POR_MERITOS;
	}
	
}
