package ar.edu.unju.fi.ejercicio9;

public class Producto {
	
	private String nombre;
	private String codigo;
	private float precio;
	private float descuento; //(valor entero comprendido entre [0,50])
	
	public Producto() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public float calcularDescuento() {
		return this.precio - this.precio * (this.descuento/100);
	}

}
