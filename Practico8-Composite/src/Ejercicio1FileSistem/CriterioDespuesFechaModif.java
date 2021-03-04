package Ejercicio1FileSistem;

import java.time.LocalDate;

public class CriterioDespuesFechaModif implements Criterio{

	private LocalDate fechamodif;
	
	public CriterioDespuesFechaModif(LocalDate fe) {
		this.fechamodif=fe;
	}
	
	@Override
	public boolean cumple(ElementFileSystem elem) {
		return elem.getFechaModificacion().isAfter(fechamodif);
	}

	
}
