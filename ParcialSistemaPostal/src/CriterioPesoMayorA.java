
public class CriterioPesoMayorA implements Criterio {

	double valor;
	
	public CriterioPesoMayorA(double v) {
		this.valor=v;
	}
	
	@Override
	public boolean cumple(ElementCombo e) {
		return e.getPeso()> valor;
	}

}
