
public class CriterioPesoExacto implements Criterio {

	private double valor;
	
	public CriterioPesoExacto(double v) {
		this.valor=v;
	}
	
	@Override
	public boolean cumple(ElementCombo e) {
		return e.getPeso()== valor;
	}

}
