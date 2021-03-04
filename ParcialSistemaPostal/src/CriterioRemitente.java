
public class CriterioRemitente implements Criterio {

	String nombre;
	
	public CriterioRemitente(String n) {
		nombre=n;
	}
	@Override
	public boolean cumple(ElementCombo e) {
		return e.contieneRemitente(nombre);
	}

}
