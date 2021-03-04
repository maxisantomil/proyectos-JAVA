import java.util.ArrayList;

public class SeguroCompuesto extends ElementSeguros{
	private int porcentaje;
	ArrayList<ElementSeguros>seguros;
	
	public SeguroCompuesto(String nombre, int descuento) {
		super(nombre);
		this.porcentaje=descuento;
		seguros= new ArrayList<>();
	}
	
	
	public void  agregarSeguro(ElementSeguros e) {
		seguros.add(e);
	}
	
	
	
	
	public int getPorcentaje() {
		return porcentaje;
	}


	@Override
	public ArrayList<SeguroSimple> ListaSegurosCriterio(Criterio c) {
		ArrayList<SeguroSimple>listTotal= new ArrayList<>();
		for (ElementSeguros e: seguros) {
			listTotal.addAll(e.ListaSegurosCriterio(c));
		}
		return listTotal;
	}


	@Override
	public String toString() {
		return "SeguroCompuesto [nombre=" + this.getNombre() + ", seguros=" + seguros + "]";
	}


	@Override
	public double getPrecio() {
		double suma=0;
		for (ElementSeguros e: seguros) {
			suma+=e.getPrecio();
		}
		suma= suma - (suma*(porcentaje))/100;
		return suma;
	}
	
	
	
	
}
