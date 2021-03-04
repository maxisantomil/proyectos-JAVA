package Ejercicio5PuertoCereales;

import java.time.LocalDate;

public class Camion {

	
	LocalDate fechaactual;
	
	
	
	
	
	
	
	
	
	public boolean esMayor() {
		LocalDate ahora= LocalDate.now();
		if (fechaactual.isBefore(ahora)) {
			return true;
		};
		return false;
	}
}
