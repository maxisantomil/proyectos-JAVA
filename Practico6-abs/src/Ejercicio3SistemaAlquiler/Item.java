
package Ejercicio3SistemaAlquiler;

import java.time.LocalDate;

public abstract class Item {
	private LocalDate fechaEntrega;
	
	public Item() {
		fechaEntrega=null;
	}
	
	public void setfechaEntrega(LocalDate d) {
		fechaEntrega=d;
	}
	

	public abstract  boolean estaDisponible();
	
	
	public abstract void itemDevuelto();
	
	public abstract void itemAlquilado();
}
