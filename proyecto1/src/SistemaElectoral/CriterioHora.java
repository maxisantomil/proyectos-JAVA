package SistemaElectoral;
import java.time.LocalDateTime;;
public class CriterioHora implements Criterio{
	private LocalDateTime hora1 ;
	private LocalDateTime hora2 ;
	
	public CriterioHora (LocalDateTime h,LocalDateTime g) {
		this.hora1= h;
		this.hora2=g;
	}
	
	public boolean Cumple(ElementSE e) {
		if (hora1.isBefore(e.getFecha())&&(hora2.isAfter(e.getFecha()))) { 
			return true;
		}
		else {
			return false;
		}
	}

}
