package tp2.fabrica;

import java.util.ArrayList;

public class Fabrica {

	private String nombre;
	private ArrayList<Mueble> muebles;
	
	public Fabrica(String nombre) {
		this.nombre = nombre;
		this.muebles = new ArrayList<>();
	}
	
	public void addMueble(Mueble mueble) {
		muebles.add(mueble);
	}
	
	public double calcularCostoStock() {
		int sum = 0;
		for (int i = 0; i < muebles.size(); i++)
			sum += muebles.get(i).getCostoStock();
		
		return sum;
	}
	
	public double calcularPrecioVentaStock() {
		int sum = 0;
		for (int i = 0; i < muebles.size(); i++)
			sum += muebles.get(i).getPrecioVentaStock();
		
		return sum;
	}
	
	
}
