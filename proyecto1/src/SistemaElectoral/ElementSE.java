package SistemaElectoral;

import java.time.LocalDateTime;
public abstract class ElementSE {
	
	
	public abstract LocalDateTime getFecha();
	public abstract String getCandidato();
	public abstract int contarVoto();

}
