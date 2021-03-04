import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroEspecial extends SeguroCompuesto {
	
	private LocalDate fechainicio;
	private LocalDate fechafin;

	
	public SeguroEspecial(String nombre, int recargo, LocalDate ini, LocalDate fin) {
		super(nombre, recargo);
		this.fechainicio=ini;
		this.fechafin=fin;
	}
	
	public boolean estaActivo() {
		return LocalDate.now().isAfter(fechainicio) && LocalDate.now().isBefore(fechafin);
	}
	
	public double getPrecio() {
		double suma=0;
		if (estaActivo()) {
			for (ElementSeguros e : seguros) {
				suma+= e.getPrecio();
			}
			return  suma+ (suma*this.getPorcentaje())/100;
		}return suma;
	}
	
	
	public ArrayList<SeguroSimple> ListaSegurosCriterio(Criterio c) {
		ArrayList<SeguroSimple>listTotal= new ArrayList<>();
		if (estaActivo()) {
			return super.ListaSegurosCriterio(c);
		}
		return listTotal;
	}

	
}
