package Ejercicio1FileSistem;

import java.time.LocalDate;

public class CriterioDespuesFecha implements Criterio {

	private LocalDate fecha;
	
	
	public CriterioDespuesFecha(LocalDate fe) {
		this.fecha=fe;
	}
	

	@Override
	public boolean cumple(ElementFileSystem elem) {
		return elem.getFechaCreacion().isAfter(fecha);
	}
	
	
}
