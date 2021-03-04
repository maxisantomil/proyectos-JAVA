
public class CriterioDestinatario implements Criterio {
	
	private String nombre;
	
	public CriterioDestinatario (String n) {
		nombre= n;
	}
	
	@Override
	public boolean cumple(ElementCombo e) {
		return e.contieneDestinatario(nombre);
	}

}
