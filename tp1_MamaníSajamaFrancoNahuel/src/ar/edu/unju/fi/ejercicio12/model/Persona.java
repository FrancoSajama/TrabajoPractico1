package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
	
	}
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
	/**Obtenemos el signo del zodiaco analizando primero el mes que nacio
	 * y luego si el dia corresponde o no al signo
	 * 
	 * @return
	 */
	public String obtenerSignoZodiaco() {
		switch (this.fechaNacimiento.get(Calendar.MONTH)) {
			case 0: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=19)return "Capricornio"; else return "Acuario";
			case 1: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=18)return "Acuario"; else return "Piscis";
			case 2: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Piscis"; else return "Aries"; 
			case 3: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=19)return "Aries"; else return "Tauro";
			case 4: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Tauro"; else return "Géminis";
			case 5: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Géminis"; else return "Cáncer";
			case 6: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=22)return "Cáncer"; else return "Leo";
			case 7: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=22)return "Leo"; else return "Virgo";
			case 8: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=22)return "Virgo"; else return "Libra";
			case 9: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=22)return "Libra"; else return "Escorpio";
			case 10:if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=21)return "Escorpio"; else return"Sagitario";
			case 11:if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=21)return "Sagitario"; else return"Capricornio";
		}
		return "";
	}
	
	/**Obtenemos la estacion analizando primero el mes que nacio
	 * En caso de que el mes de nacimiento sea uno donde las estaciones cambia,
	 * pasamos a analizar el dia de nacimiento
	 * 
	 * @return
	 */
	public String obtenerEstacion() {
		switch (this.fechaNacimiento.get(Calendar.MONTH)) {
			case 0: return "Verano";
			case 1: return "Verano";
			case 2: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Verano"; else return "Otoño";
			case 3: return "Otoño";
			case 4: return "Otoño";
			case 5: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Otoño"; else return "Invierno";
			case 6: return "Invierno";
			case 7: return "Invierno";
			case 8: if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Invierno"; else return "Primavera";
			case 9: return "Primavera";
			case 10:return "Primavera";
			case 11:if(this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)<=20)return "Primavera"; else return "Verano";
		}
		return "";
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", getNombre()=" + getNombre()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", calcularEdad()=" + calcularEdad()
				+ ", obtenerSignoZodiaco()=" + obtenerSignoZodiaco() + ", obtenerEstacion()=" + obtenerEstacion()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	/**Muestra de datos
	 * 
	 */
	public void mostrarDatos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de nacimiento: "+sdf.format(this.fechaNacimiento.getTime()));
		//System.out.println("Fecha de nacimiento: "+this.fechaNacimiento.getTime());
	}
		
}
