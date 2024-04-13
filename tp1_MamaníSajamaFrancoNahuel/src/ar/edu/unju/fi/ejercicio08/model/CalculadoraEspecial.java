package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {

	private Integer n;

	public CalculadoraEspecial() {
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	public float calcularSumatoria() {
		float sumatoria = 0;
		
		for(int k=1; k<=this.n; k++) {
			System.out.println(sumatoria);
			sumatoria+=Math.pow(k*(k+1)/2, 2);
			System.out.println(sumatoria);
		}
		return sumatoria;
	}
	
	public Integer calcularProductoria() {
		Integer productoria = 1;
		
		for(int k=1; k<=this.n; k++)
			productoria*=k*(k+4);
		
		return productoria;
	}
}
