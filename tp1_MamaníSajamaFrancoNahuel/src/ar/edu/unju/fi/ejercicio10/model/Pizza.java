package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private Integer diametro;
	private float precio;
	private float area;
	private boolean ingredientesEspeciales;
	private final int adicionalIngredientesEspeciales20 = 500;
	private final int adicionalIngredientesEspeciales30 = 750;
	private final int adicionalIngredientesEspeciales40 = 1000;
	
	public Pizza() {
		
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getAdicionalIngredientesEspeciales20() {
		return adicionalIngredientesEspeciales20;
	}

	public int getAdicionalIngredientesEspeciales30() {
		return adicionalIngredientesEspeciales30;
	}

	public int getAdicionalIngredientesEspeciales40() {
		return adicionalIngredientesEspeciales40;
	}
	
	public void calcularPrecio() {
		
		switch(this.diametro) {
			case 20:
				this.precio=this.ingredientesEspeciales ? 4500+this.adicionalIngredientesEspeciales20:4500;
				break;
			case 30:
				this.precio=this.ingredientesEspeciales ? 4800+this.adicionalIngredientesEspeciales30:4800;
				break;
			case 40:
				this.precio=this.ingredientesEspeciales ? 5500+this.adicionalIngredientesEspeciales40:5500;
				break;
			default:
		}
	}
	
	public void calcularArea() {
		this.area=(float) (Math.PI*Math.pow(this.diametro/2, 2));
	}
	
	public void mostrarDatos() {
		System.out.println("Diametro: "+this.diametro+" cm.");
		System.out.println("Ingredientes especiales: "+this.ingredientesEspeciales);
		System.out.println("Precio de la pizza: "+this.precio);
		System.out.println("Área de la pizza: "+this.area+" cm2.");
	}
	
}
